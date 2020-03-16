package com.dagger.raju.myapplication.di;

import com.dagger.raju.myapplication.MainActivity;

import com.dagger.raju.myapplication.di.checkout.CheckoutComponent;
import com.raju.karthikeyan.payment.di.PaymentComponent;
import com.dagger.raju.myapplication.di.scope.AppScope;

import dagger.Component;

/**
 * Created by raju on 7/4/19.
 */
@Component(dependencies = { CheckoutComponent.class, PaymentComponent.class}, modules = {AppModule.class, ReceiversModule.class, UtilsModule.class})
@AppScope
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
