package com.zombie.nerd.studio.actionbingo.ui.fragments.main

import android.os.Bundle
import android.view.View
import com.orhanobut.hawk.Hawk
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.TestFragment
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

class MainFragment : BaseFragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chiki.setOnClickListener {
            fragmentHandler.createFragmentWithBack(TestFragment())
        }
    }
}