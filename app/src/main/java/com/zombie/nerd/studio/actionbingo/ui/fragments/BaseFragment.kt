package com.zombie.nerd.studio.actionbingo.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zombie.nerd.studio.actionbingo.common.FragmentHandler
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment(private var layoutId: Int) : DaggerFragment() {

    @Inject
    lateinit var fragmentHandler: FragmentHandler

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }
}