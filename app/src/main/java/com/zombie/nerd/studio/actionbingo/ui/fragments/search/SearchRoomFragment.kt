package com.zombie.nerd.studio.actionbingo.ui.fragments.search

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.fill.FillGameFieldFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.game.GameFieldFragment
import kotlinx.android.synthetic.main.fragment_search_room.*

class SearchRoomFragment : BaseFragment(R.layout.fragment_search_room) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        room_search_next_button.setOnClickListener {
            fragmentHandler.createFragmentWithBackStack(GameFieldFragment())
        }
    }
}