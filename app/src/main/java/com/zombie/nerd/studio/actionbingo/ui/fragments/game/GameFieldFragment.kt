package com.zombie.nerd.studio.actionbingo.ui.fragments.game

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.view.BingoView
import kotlinx.android.synthetic.main.fragment_game_field.*

class GameFieldFragment : BaseFragment(R.layout.fragment_game_field) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        game_container.addView(BingoView(3, activity!!))
    }
}