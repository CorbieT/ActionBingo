package com.zombie.nerd.studio.actionbingo

import com.orhanobut.hawk.Hawk
import com.zombie.nerd.studio.actionbingo.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector

class App: DaggerApplication(), HasAndroidInjector {

    override fun onCreate() {
        super.onCreate()
        Hawk.init(this).build()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().application(this).build()
}