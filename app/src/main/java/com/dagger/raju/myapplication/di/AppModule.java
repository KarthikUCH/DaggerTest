package com.dagger.raju.myapplication.di;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raju on 7/4/19.
 */
@Module
public class AppModule {

    private Context appContext;

    public AppModule(Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    @NonNull
    @Singleton
    Context providesContext() {
        return appContext;
    }
}
