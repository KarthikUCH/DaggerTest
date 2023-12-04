package com.raju.karthikeyan.payment.di;

import org.koin.core.scope.Scope;

public interface PaymentUiScopeProvider {

    Scope providePaymentUiScope();

    void closePaymentUiScope();
}
