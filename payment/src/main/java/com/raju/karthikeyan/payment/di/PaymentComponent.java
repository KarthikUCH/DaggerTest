package com.raju.karthikeyan.payment.di;

import com.raju.karthikeyan.payment.PaymentActivity;
import com.raju.karthikeyan.payment.PaymentRepository;
import com.raju.karthikeyan.payment.PaymentUseCase;
import dagger.Component;
import javax.inject.Singleton;

@Component(modules = {PaymentModule.class})
@Singleton
public interface PaymentComponent {

    PaymentUseCase getPaymentUseCase();

    PaymentRepository getPaymentRepository();

    void inject(PaymentActivity activity);
}
