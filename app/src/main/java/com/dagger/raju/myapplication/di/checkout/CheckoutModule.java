package com.dagger.raju.myapplication.di.checkout;

import androidx.annotation.NonNull;
import com.dagger.raju.myapplication.CheckoutManager;
import com.dagger.raju.myapplication.di.scope.AppScope;
import com.raju.karthikeyan.payment.ICheckoutManager;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class CheckoutModule {

    @Provides
    @AppScope
    @NonNull
    ICheckoutManager providesCheckoutManager() {
        return new CheckoutManager();
    }
}
