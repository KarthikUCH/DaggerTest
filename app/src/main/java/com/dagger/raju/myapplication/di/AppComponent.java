package com.dagger.raju.myapplication.di;

import android.content.Context;

import com.dagger.raju.myapplication.MainActivity;
import com.dagger.raju.myapplication.repository.IDataRepository;
import com.dagger.raju.myapplication.utils.RxUtils;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by raju on 7/4/19.
 */
@Component(modules = {AppModule.class, ReceiversModule.class, UtilsModule.class, DataModule.class})
@Singleton
public interface AppComponent {

    Context getContext();
    RxUtils getRxUtils();
    IDataRepository getIDataRepository();

    void inject(MainActivity mainActivity);
}
