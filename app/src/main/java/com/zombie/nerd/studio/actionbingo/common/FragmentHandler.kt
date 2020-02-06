package com.zombie.nerd.studio.actionbingo.common

import androidx.fragment.app.Fragment

interface FragmentHandler {
    fun createFragment(fragment: Fragment)
    fun createFragmentWithBack(fragment: Fragment, tag: String? = null)
}