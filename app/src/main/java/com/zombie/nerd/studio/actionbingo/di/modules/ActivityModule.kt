package com.zombie.nerd.studio.actionbingo.di.modules

import android.app.Activity
import com.zombie.nerd.studio.actionbingo.di.scopes.ActivityScope
import com.zombie.nerd.studio.actionbingo.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.Reusable
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
//    @Binds
//    @Reusable
//    abstract fun bindActivity(appActivity: MainActivity): Activity

    @ContributesAndroidInjector(modules = [FragmentsModule::class])
    abstract fun mainActivity(): MainActivity
}