package com.zombie.nerd.studio.actionbingo.ui.fragments.fill

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import com.zombie.nerd.studio.actionbingo.R
import com.zombie.nerd.studio.actionbingo.common.Constants
import com.zombie.nerd.studio.actionbingo.ui.fragments.BaseFragment
import com.zombie.nerd.studio.actionbingo.ui.view.BingoView2
import kotlinx.android.synthetic.main.fragment_fill_game_field.*

class FillGameFieldFragment : BaseFragment(R.layout.fragment_fill_game_field) {

    private var fieldSize: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fieldSize = arguments?.getInt(Constants.FIELD_SIZE_KEY, 0)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fieldSize?.let {
            BingoView2(activity!!, it).apply {
                this.layoutParams = ViewGroup.LayoutParams(0, 0)
                id = View.generateViewId()
                fill_game_container.addView(this)
                adjustViewConstraints(this)
            }
        }
    }

    private fun adjustViewConstraints(view: View) {
        ConstraintSet().apply {
            clone(fill_game_container)
            connect(view.id, ConstraintSet.LEFT, fill_game_container.id, ConstraintSet.LEFT, 0)
            connect(view.id, ConstraintSet.RIGHT, fill_game_container.id, ConstraintSet.RIGHT, 0)
            connect(view.id, ConstraintSet.TOP, fill_game_container.id, ConstraintSet.TOP, 0)
            connect(view.id, ConstraintSet.BOTTOM, fill_game_container.id, ConstraintSet.BOTTOM, 0)
            setDimensionRatio(view.id, "1:1")
            applyTo(fill_game_container)
        }
    }

}