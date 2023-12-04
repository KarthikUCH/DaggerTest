package com.raju.karthikeyan.payment.di

import com.raju.karthikeyan.payment.PaymentManager
import com.raju.karthikeyan.payment.PaymentRepository
import com.raju.karthikeyan.payment.PaymentUseCase
import org.koin.dsl.module

/*
@Module
class PaymentModule(checkoutManager: ICheckoutManager) {
    private val checkoutManager: ICheckoutManager

    init {
        this.checkoutManager = checkoutManager
    }

    @Provides
    @Singleton
    fun providePaymentRepository(): PaymentRepository {
        return PaymentRepository()
    }

    @Provides
    @Singleton
    fun providePaymentUseCase(): PaymentUseCase {
        return PaymentUseCase()
    }

    @Provides
    @Singleton
    fun providePaymentManager(): PaymentManager {
        return PaymentManager(checkoutManager)
    }
}*/

val paymentModule = module {
    single { PaymentRepository() }
    single { PaymentUseCase() }
    single { PaymentManager(get()) }
}
