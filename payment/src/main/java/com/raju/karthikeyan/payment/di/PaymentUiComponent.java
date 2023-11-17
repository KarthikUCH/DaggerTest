package com.raju.karthikeyan.payment.di;

import com.raju.karthikeyan.payment.PaymentActivity;

import javax.inject.Singleton;

import dagger.Subcomponent;

@Subcomponent(modules = {PaymentUiModule.class})
@Singleton
public interface PaymentUiComponent {
    void inject(PaymentActivity activity);
}
