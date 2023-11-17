package com.dagger.raju.myapplication;

import android.app.Application;

import com.dagger.raju.myapplication.di.AppComponent;
import com.dagger.raju.myapplication.di.AppModule;
import com.dagger.raju.myapplication.di.DaggerPaymentComponent;
import com.dagger.raju.myapplication.di.PaymentComponent;
import com.dagger.raju.myapplication.di.ReceiversModule;
import com.dagger.raju.myapplication.di.UtilsModule;
import com.dagger.raju.myapplication.di.checkout.CheckoutModule;
import com.raju.karthikeyan.payment.di.PaymentComponentProvider;
import com.raju.karthikeyan.payment.di.PaymentModule;
import com.raju.karthikeyan.payment.di.PaymentUiComponent;
import com.raju.karthikeyan.payment.di.PaymentUiModule;

/**
 * Created by raju on 7/4/19.
 */
public class App extends Application implements PaymentComponentProvider {

    private static PaymentComponent paymentComponent;
    private static AppComponent appComponent;
    private static PaymentUiComponent paymentUiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        paymentComponent = providePaymentComponent();
        appComponent = buildComponent();
    }


    /**
     * AppComponent --> Need --> PaymentComponent
     * Make ==> AppComponent -->  SubComponent of --> PaymentComponent
     * <p>
     * PaymentUiComponent --> Need --> AppComponent + PaymentComponent
     * Make PaymentUiComponent -->  SubComponent of --> AppComponent
     * Note: PaymentUiComponent can still access PaymentComponent through AppComponent
     */

    public PaymentComponent providePaymentComponent() {
        return DaggerPaymentComponent.builder()
                .paymentModule(new PaymentModule())
                .build();
    }

    /***********************************************************************************************
     *********************     DAGGER INITIALIZATION  FOR APP COMPONENT      ***********************
     ***********************************************************************************************/

    private AppComponent buildComponent() {
        if (appComponent == null) {
            appComponent = paymentComponent.plusAppComponent(new AppModule(this), new ReceiversModule(), new UtilsModule(), new CheckoutModule());
        }
        return appComponent;
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    //***************************************    END    *******************************************//

    /***********************************************************************************************
     *********************   DAGGER INITIALIZATION  FOR PAYMENT UI COMPONENT ***********************
     ***********************************************************************************************/
    @Override
    public PaymentUiComponent providePaymentUiComponent() {
        if (paymentUiComponent == null) {
            paymentUiComponent = appComponent.plusPaymentUiComponent(new PaymentUiModule());
        }
        return paymentUiComponent;
    }

    @Override
    public void clearPaymentUiComponent() {
        paymentUiComponent = null;
    }

    //***************************************    END    *******************************************//

}
