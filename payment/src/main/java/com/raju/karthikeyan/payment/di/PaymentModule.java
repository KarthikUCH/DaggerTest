package com.raju.karthikeyan.payment.di;

import com.raju.karthikeyan.payment.PaymentRepository;
import com.raju.karthikeyan.payment.PaymentUseCase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class PaymentModule {

    @Provides
    @Singleton
    PaymentRepository providePaymentRepository(){
        return new PaymentRepository();
    }

    @Provides
    @Singleton
    PaymentUseCase providePaymentUseCase(){
        return new PaymentUseCase();
    }
}
