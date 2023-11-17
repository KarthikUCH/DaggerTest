package com.raju.karthikeyan.payment.di;

public interface PaymentComponentProvider {

    PaymentUiComponent providePaymentUiComponent();

    void clearPaymentUiComponent();

}
