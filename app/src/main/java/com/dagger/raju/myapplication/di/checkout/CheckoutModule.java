package com.dagger.raju.myapplication.di.checkout;

import androidx.annotation.NonNull;
import com.dagger.raju.myapplication.CheckoutManager;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class CheckoutModule {

    @Provides
    @NonNull
    CheckoutManager providesCheckoutManager() {
        return new CheckoutManager();
    }
}
