package com.raju.karthikeyan.payment.di;

import com.raju.karthikeyan.payment.ICheckoutManager;
import com.raju.karthikeyan.payment.PaymentManager;
import com.raju.karthikeyan.payment.PaymentRepository;
import com.raju.karthikeyan.payment.PaymentUseCase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PaymentUiModule {
    @Provides
    @Singleton
    PaymentManager providePaymentManager(ICheckoutManager checkoutManager){
        return new PaymentManager(checkoutManager);
    }
}
