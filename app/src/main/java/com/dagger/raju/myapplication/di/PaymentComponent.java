package com.dagger.raju.myapplication.di;

import com.dagger.raju.myapplication.di.checkout.CheckoutModule;
import com.raju.karthikeyan.payment.di.PaymentModule;
import com.raju.karthikeyan.payment.di.scope.PaymentDataScope;

import dagger.Component;

@Component(modules = {PaymentModule.class})
@PaymentDataScope
public interface PaymentComponent {

    AppComponent plusAppComponent(AppModule appModule, ReceiversModule receiversModule, UtilsModule utilsModule, CheckoutModule checkoutModule);

}
