package com.dagger.raju.myapplication

import android.app.Application
import com.dagger.raju.myapplication.di.checkoutModule
import com.dagger.raju.myapplication.di.receiverModule
import com.dagger.raju.myapplication.di.utilsModule
import com.raju.karthikeyan.payment.di.PaymentUiScopeProvider
import com.raju.karthikeyan.payment.di.paymentModule
import com.raju.karthikeyan.payment.di.paymentUiModule
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope

/**
 * Created by raju on 7/4/19.
 */
class App : Application(),
    PaymentUiScopeProvider {

    private lateinit var paymentUiQualifiedScope: Scope
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    receiverModule,
                    utilsModule,
                    checkoutModule,
                    paymentModule,
                    paymentUiModule
                )
            )
        }
    }

    /**
     * Will create new scope or existing scope for paymentUiModule dependencies
     */
    override fun providePaymentUiScope(): Scope {
        paymentUiQualifiedScope =
            getKoin().getOrCreateScope("PaymentUIScopeId", named("PaymentUIScope"))
        return paymentUiQualifiedScope
    }

    /**
     * Will close existing scope for paymentUiModule dependencies
     */
    override fun closePaymentUiScope() {
        providePaymentUiScope()
    }
}