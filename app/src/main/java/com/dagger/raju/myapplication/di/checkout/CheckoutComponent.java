package com.dagger.raju.myapplication.di.checkout;

import com.dagger.raju.myapplication.CheckoutManager;
import dagger.Component;
import javax.inject.Singleton;

@Component(modules = {CheckoutModule.class})
@Singleton
public interface CheckoutComponent {
    CheckoutManager getCheckoutManager();
}
