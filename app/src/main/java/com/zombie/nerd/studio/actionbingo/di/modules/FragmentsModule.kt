package com.zombie.nerd.studio.actionbingo.di.modules

import com.zombie.nerd.studio.actionbingo.ui.fragments.TestFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.chooser.FieldChooserFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.game.GameFieldFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.main.MainFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.mode.OnlineModeFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.room.RoomCreatorFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.search.SearchRoomFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.settings.SettingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment

    @ContributesAndroidInjector
    abstract fun testFragment(): TestFragment

    @ContributesAndroidInjector
    abstract fun fieldChooserFragment(): FieldChooserFragment

    @ContributesAndroidInjector
    abstract fun roomCreatorFragment(): RoomCreatorFragment

    @ContributesAndroidInjector
    abstract fun gameFieldFragment(): GameFieldFragment

    @ContributesAndroidInjector
    abstract fun onlineModeFragment(): OnlineModeFragment

    @ContributesAndroidInjector
    abstract fun searchRoomFragment(): SearchRoomFragment

    @ContributesAndroidInjector
    abstract fun settingsFragment(): SettingsFragment
}