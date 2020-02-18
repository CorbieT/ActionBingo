package com.zombie.nerd.studio.actionbingo.ui.fragments.chooser

import android.os.Bundle
import android.view.View
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.common.Constants
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.fragments.fill.FillGameFieldFragment
import kotlinx.android.synthetic.main.fragment_field_chooser.*

class FieldChooserFragment : BaseFragment(R.layout.fragment_field_chooser) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_button_chooser.setOnClickListener {
            val fillGameFieldFragment = FillGameFieldFragment().also {
                it.arguments = Bundle().apply {
                    this.putInt(Constants.FIELD_SIZE_KEY, when(radioGroup.checkedRadioButtonId) {
                        R.id.field_3 -> 3
                        R.id.field_4 -> 4
                        R.id.field_5 -> 5
                        else -> 0
                    })
                }
            }

            fragmentHandler.createFragmentWithBackStack(fillGameFieldFragment)
        }
    }
}