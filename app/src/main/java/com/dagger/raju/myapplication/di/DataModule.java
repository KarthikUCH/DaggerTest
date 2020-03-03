package com.dagger.raju.myapplication.di;

import com.dagger.raju.myapplication.repository.DataRepository;
import com.dagger.raju.myapplication.repository.IDataRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    @Singleton
    public IDataRepository provideIDataRepository(){
        return new DataRepository();
    }
}
