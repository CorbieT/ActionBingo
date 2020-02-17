package com.zombie.nerd.studio.actionbingo.ui.fragments.mode

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.room.RoomCreatorFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.search.SearchRoomFragment
import kotlinx.android.synthetic.main.fragment_online_mode.*

class OnlineModeFragment : BaseFragment(R.layout.fragment_online_mode) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        create_button.setOnClickListener {
            fragmentHandler.createFragmentWithBackStack(RoomCreatorFragment())
        }

        find_button.setOnClickListener {
            fragmentHandler.createFragmentWithBackStack(SearchRoomFragment())
        }
    }
}