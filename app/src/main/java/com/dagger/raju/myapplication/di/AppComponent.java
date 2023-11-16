package com.dagger.raju.myapplication.di;

import com.dagger.raju.myapplication.MainActivity;

import com.dagger.raju.myapplication.di.checkout.CheckoutModule;
import com.raju.karthikeyan.payment.di.PaymentComponent;
import com.dagger.raju.myapplication.di.scope.AppScope;
import com.raju.karthikeyan.payment.di.PaymentModule;

import dagger.Component;

/**
 * Created by raju on 7/4/19.
 */
@Component(modules = {AppModule.class, ReceiversModule.class, UtilsModule.class, CheckoutModule.class})
@AppScope
public interface AppComponent {

    PaymentComponent plusPaymentComponent(PaymentModule paymentModule);

    void inject(MainActivity mainActivity);
}
