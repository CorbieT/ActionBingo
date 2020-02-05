package com.zombie.nerd.studio.actionbingo.di

import android.content.Context
import com.zombie.nerd.studio.actionbingo.App
import com.zombie.nerd.studio.actionbingo.di.modules.ActivityModule
import com.zombie.nerd.studio.actionbingo.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ActivityModule::class, AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(context: Context): Builder

        fun build(): AppComponent
    }

    override fun inject(app: DaggerApplication)
}