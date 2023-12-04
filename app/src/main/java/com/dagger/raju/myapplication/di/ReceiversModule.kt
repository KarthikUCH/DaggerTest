package com.dagger.raju.myapplication.di

import com.dagger.raju.myapplication.network.NetworkChannel
import org.koin.dsl.module

/**
 * Created by raju on 7/4/19.
 */

val receiverModule = module {
    single { NetworkChannel() }
}