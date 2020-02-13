package com.zombie.nerd.studio.actionbingo.ui.fragments.chooser

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.game.GameFieldFragment
import kotlinx.android.synthetic.main.fragment_field_chooser.*

class FieldChooserFragment : BaseFragment(R.layout.fragment_field_chooser) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_button_chooser.setOnClickListener { fragmentHandler.createFragmentWithBack(GameFieldFragment()) }
    }
}