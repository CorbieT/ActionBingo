package com.zombie.nerd.studio.actionbingo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.common.FragmentHandler
import com.zombie.nerd.studio.actionbingo.ui.fragments.main.MainFragment
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity(), FragmentHandler {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createFragment(MainFragment())
    }

    override fun createFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }

    override fun createFragmentWithBack(fragment: Fragment, tag: String?) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(tag)
            .commit()
    }

}
