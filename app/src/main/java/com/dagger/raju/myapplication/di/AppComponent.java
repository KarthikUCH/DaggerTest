package com.dagger.raju.myapplication.di;

import com.dagger.raju.myapplication.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by raju on 7/4/19.
 */
@Component(modules = {AppModule.class, ReceiversModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
