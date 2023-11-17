package com.raju.karthikeyan.payment.di;

import com.raju.karthikeyan.payment.ICheckoutManager;
import com.raju.karthikeyan.payment.PaymentManager;
import com.raju.karthikeyan.payment.PaymentRepository;
import com.raju.karthikeyan.payment.PaymentUseCase;
import com.raju.karthikeyan.payment.di.scope.PaymentDataScope;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class PaymentModule {

    @Provides
    @PaymentDataScope
    PaymentRepository providePaymentRepository(){
        return new PaymentRepository();
    }

    @Provides
    @PaymentDataScope
    PaymentUseCase providePaymentUseCase(){
        return new PaymentUseCase();
    }
}
