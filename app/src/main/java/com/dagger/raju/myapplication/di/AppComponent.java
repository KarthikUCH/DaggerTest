package com.dagger.raju.myapplication.di;

import com.dagger.raju.myapplication.MainActivity;
import com.dagger.raju.myapplication.di.checkout.CheckoutModule;
import com.raju.karthikeyan.payment.di.PaymentUiComponent;
import com.raju.karthikeyan.payment.di.PaymentUiModule;
import com.raju.karthikeyan.payment.di.scope.AppScope;

import dagger.Subcomponent;

/**
 * Created by raju on 7/4/19.
 */
@Subcomponent(modules = {AppModule.class, ReceiversModule.class, UtilsModule.class, CheckoutModule.class})
@AppScope
public interface AppComponent {

    PaymentUiComponent plusPaymentUiComponent(PaymentUiModule paymentUiModule);

    void inject(MainActivity mainActivity);
}
