package com.zombie.nerd.studio.actionbingo.ui.fragments.main

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.chooser.FieldChooserFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.mode.OnlineModeFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.room.RoomCreatorFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.search.SearchRoomFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.settings.SettingsFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        online_button.setOnClickListener {
            fragmentHandler.createFragmentWithBackStack(OnlineModeFragment())
        }
        offline_button.setOnClickListener {
            fragmentHandler.createFragmentWithBackStack(FieldChooserFragment())
        }
        settings_button.setOnClickListener {
            fragmentHandler.createFragmentWithBackStack(SettingsFragment())
        }
    }
}