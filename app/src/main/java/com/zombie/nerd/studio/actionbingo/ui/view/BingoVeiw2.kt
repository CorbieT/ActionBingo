package com.zombie.nerd.studio.actionbingo.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.zombie.nerd.studio.actionbingo.R
import kotlinx.android.synthetic.main.fragment_room_creator.view.*

class BingoView2(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    private var cellCount = 0
    private var cells = mutableListOf<TextView>()

    init {
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.BingoView, 0, 0)
        try {
            cellCount = a.getInteger(R.styleable.BingoView_cellCount, 0)
        } finally {
            a.recycle()
        }

        this.orientation = VERTICAL
        createCells()
    }

    private fun createCells() {
        for (i in 1..cellCount) {
            val container = createCellContainer()
            for (j in 1..cellCount) {
                val textView = createTextView()
                textView.text = "#TEST"
                container.addView(textView).also { cells.add(textView) }
            }
            this.addView(container)
        }
    }

    private fun createCellContainer(): LinearLayout {
        val linearLayout = LinearLayout(context)
        linearLayout.orientation = HORIZONTAL

        val layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        linearLayout.layoutParams = layoutParams
        layoutParams.weight = 1f
        return linearLayout
    }

    private fun createTextView(): TextView {
        val textView = TextView(context)
        textView.gravity = Gravity.CENTER
        textView.isClickable = true
        textView.isFocusable = true
        textView.setBackgroundResource(R.drawable.cell_selector)
        textView.setOnClickListener {
            textView.text = "ZDAROVA"
        }
        textView.setOnLongClickListener {
            textView.text = "NU ZDAROVA"
            return@setOnLongClickListener true
        }

        val textViewParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        textViewParams.weight = 1f
        textView.layoutParams = textViewParams
        return textView
    }
}