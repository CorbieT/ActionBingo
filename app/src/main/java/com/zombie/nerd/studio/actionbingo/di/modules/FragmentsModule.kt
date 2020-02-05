package com.zombie.nerd.studio.actionbingo.di.modules

import com.zombie.nerd.studio.actionbingo.ui.fragments.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}