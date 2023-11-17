package com.dagger.raju.myapplication.di.checkout;

import androidx.annotation.NonNull;
import com.dagger.raju.myapplication.CheckoutManager;
import com.raju.karthikeyan.payment.di.scope.AppScope;
import com.raju.karthikeyan.payment.ICheckoutManager;

import dagger.Module;
import dagger.Provides;

@Module
public class CheckoutModule {

    @Provides
    @AppScope
    @NonNull
    ICheckoutManager providesCheckoutManager() {
        return new CheckoutManager();
    }
}
