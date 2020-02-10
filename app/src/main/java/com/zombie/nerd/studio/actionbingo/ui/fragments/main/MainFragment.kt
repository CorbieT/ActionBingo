package com.zombie.nerd.studio.actionbingo.ui.fragments.main

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.TestFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.chooser.FieldChooserFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.room.RoomCreatorFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        start.setOnClickListener {
            fragmentHandler.createFragmentWithBack(RoomCreatorFragment())
        }
        test.setOnClickListener {
            fragmentHandler.createFragmentWithBack(TestFragment())
        }
    }
}