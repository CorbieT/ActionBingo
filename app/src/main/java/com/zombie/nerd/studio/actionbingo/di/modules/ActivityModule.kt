package com.zombie.nerd.studio.actionbingo.di.modules

import com.zombie.nerd.studio.actionbingo.common.FragmentHandler
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

    @Binds
    @Reusable
    abstract fun bindFragmentHandler(activity: MainActivity): FragmentHandler

    @ContributesAndroidInjector(modules = [FragmentsModule::class])
    abstract fun mainActivity(): MainActivity
}