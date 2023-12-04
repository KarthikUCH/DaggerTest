package com.dagger.raju.myapplication.di

import com.dagger.raju.myapplication.CheckoutManager
import com.raju.karthikeyan.payment.ICheckoutManager
import org.koin.dsl.module

val checkoutModule = module {
    single<ICheckoutManager> { CheckoutManager() }
}
