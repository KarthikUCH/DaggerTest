package com.raju.karthikeyan.payment.di;

import com.raju.karthikeyan.payment.PaymentRepository;
import com.raju.karthikeyan.payment.PaymentUseCase;
import com.raju.karthikeyan.payment.di.scope.PaymentScope;
import dagger.Module;
import dagger.Provides;

@Module
public class PaymentModule {

    @Provides
    @PaymentScope
    PaymentRepository providePaymentRepository(){
        return new PaymentRepository();
    }

    @Provides
    @PaymentScope
    PaymentUseCase providePaymentUseCase(){
        return new PaymentUseCase();
    }
}
