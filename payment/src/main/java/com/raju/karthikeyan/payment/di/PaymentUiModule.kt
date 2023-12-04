package com.raju.karthikeyan.payment.di

import com.raju.karthikeyan.payment.PaymentManager
import org.koin.core.qualifier.named
import org.koin.dsl.module

val paymentUiModule = module {

    scope(named(name = "PaymentUIScope")) {

        scoped { PaymentManager(get()) }
    }
}