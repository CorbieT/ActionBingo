package com.zombie.nerd.studio.actionbingo.di.modules

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.android.support.DaggerApplication

@Module
abstract class AppModule {
    @Binds
    @Reusable
    abstract fun bindContext(daggerApplication: DaggerApplication): Context
}