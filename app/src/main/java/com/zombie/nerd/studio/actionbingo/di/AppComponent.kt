package com.zombie.nerd.studio.actionbingo.di

import com.zombie.nerd.studio.actionbingo.di.modules.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
}