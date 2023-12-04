package com.dagger.raju.myapplication

import android.app.Application
import com.dagger.raju.myapplication.di.checkoutModule
import com.dagger.raju.myapplication.di.receiverModule
import com.dagger.raju.myapplication.di.utilsModule
import com.raju.karthikeyan.payment.di.paymentModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by raju on 7/4/19.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(receiverModule, utilsModule, checkoutModule, paymentModule))
        }
    }
}