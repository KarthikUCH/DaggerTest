package com.dagger.raju.myapplication.di

import com.dagger.raju.myapplication.utils.NetworkUtil
import com.dagger.raju.myapplication.utils.RxUtils
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Created by raju on 7/4/19.
 */

val utilsModule = module {
    single { RxUtils(androidContext()) }
    single { NetworkUtil(androidContext(), get()) }
}
