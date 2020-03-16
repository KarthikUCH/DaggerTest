package com.dagger.raju.myapplication;

import android.app.Application;
import com.dagger.raju.myapplication.di.AppComponent;
import com.dagger.raju.myapplication.di.AppModule;
import com.dagger.raju.myapplication.di.DaggerAppComponent;
import com.dagger.raju.myapplication.di.ReceiversModule;
import com.dagger.raju.myapplication.di.UtilsModule;
import com.dagger.raju.myapplication.di.checkout.CheckoutComponent;
import com.dagger.raju.myapplication.di.checkout.CheckoutModule;
import com.dagger.raju.myapplication.di.checkout.DaggerCheckoutComponent;
import com.raju.karthikeyan.payment.di.DaggerPaymentComponent;
import com.raju.karthikeyan.payment.di.PaymentComponent;
import com.raju.karthikeyan.payment.di.PaymentComponentProvider;
import com.raju.karthikeyan.payment.di.PaymentModule;

/**
 * Created by raju on 7/4/19.
 */
public class App extends Application implements PaymentComponentProvider {

    private static AppComponent appComponent;
    private static CheckoutComponent checkoutComponent;
    private static PaymentComponent paymentComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        checkoutComponent = buildCheckoutComponent();
        paymentComponent = providePaymentComponent();
        appComponent = buildComponent();
    }

    private CheckoutComponent buildCheckoutComponent() {
        return DaggerCheckoutComponent.builder()
                .checkoutModule(new CheckoutModule())
                .build();
    }

    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .receiversModule(new ReceiversModule())
                .utilsModule(new UtilsModule())
                .checkoutComponent(checkoutComponent)
                .paymentComponent(paymentComponent)
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override public PaymentComponent providePaymentComponent() {

        if (paymentComponent == null) {
            paymentComponent = DaggerPaymentComponent.builder()
                    .paymentModule(new PaymentModule(checkoutComponent.getCheckoutManager()))
                    .build();
        }
        return paymentComponent;
    }

    @Override
    public void clearPaymentComponent() {
        paymentComponent = null;
    }
}
