package com.zombie.nerd.studio.actionbingo.ui.fragments.room

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.chooser.FieldChooserFragment
import kotlinx.android.synthetic.main.fragment_room_creator.*

class RoomCreatorFragment : BaseFragment(R.layout.fragment_room_creator) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_button.setOnClickListener { fragmentHandler.createFragmentWithBack(FieldChooserFragment()) }
    }
}