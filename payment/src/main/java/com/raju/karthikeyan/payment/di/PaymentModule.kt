package com.raju.karthikeyan.payment.di

import com.raju.karthikeyan.payment.PaymentManager
import com.raju.karthikeyan.payment.PaymentRepository
import com.raju.karthikeyan.payment.PaymentUseCase
import org.koin.dsl.module


val paymentModule = module {
    single { PaymentRepository() }
    single { PaymentUseCase() }
}
