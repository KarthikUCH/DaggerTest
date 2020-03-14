package com.raju.karthikeyan.payment.di;

import com.raju.karthikeyan.payment.PaymentActivity;
import com.raju.karthikeyan.payment.di.scope.PaymentScope;
import dagger.Component;
import dagger.Subcomponent;

@Component(modules = {PaymentModule.class})
@PaymentScope
public interface PaymentComponent {

    void inject(PaymentActivity activity);
}
