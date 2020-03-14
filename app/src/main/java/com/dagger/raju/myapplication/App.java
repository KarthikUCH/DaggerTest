package com.dagger.raju.myapplication;

import android.app.Application;
import com.dagger.raju.myapplication.di.AppComponent;
import com.dagger.raju.myapplication.di.AppModule;
import com.dagger.raju.myapplication.di.DaggerAppComponent;
import com.dagger.raju.myapplication.di.ReceiversModule;
import com.dagger.raju.myapplication.di.UtilsModule;
import com.raju.karthikeyan.payment.di.DaggerPaymentComponent;
import com.raju.karthikeyan.payment.di.PaymentComponent;
import com.raju.karthikeyan.payment.di.PaymentComponentProvider;
import com.raju.karthikeyan.payment.di.PaymentModule;

/**
 * Created by raju on 7/4/19.
 */
public class App extends Application implements PaymentComponentProvider {

    private static AppComponent appComponent;
    private static PaymentComponent paymentComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = buildComponent();
    }

    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .receiversModule(new ReceiversModule())
                .utilsModule(new UtilsModule())
                .paymentComponent(providePaymentComponent())
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override public PaymentComponent providePaymentComponent() {

        if (paymentComponent == null) {
            paymentComponent = DaggerPaymentComponent.builder()
                    .paymentModule(new PaymentModule())
                    .build();
        }
        return paymentComponent;
    }

    @Override
    public void clearPaymentComponent() {
        paymentComponent = null;
    }
}
