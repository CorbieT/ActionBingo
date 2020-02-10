package com.zombie.nerd.studio.actionbingo.di.modules

import com.zombie.nerd.studio.actionbingo.ui.fragments.TestFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.chooser.FieldChooserFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.figure.FillFigureFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.main.MainFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.room.RoomCreatorFragment
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
    abstract fun fillFigureFragment(): FillFigureFragment

    @ContributesAndroidInjector
    abstract fun roomCreatorFragment(): RoomCreatorFragment
}