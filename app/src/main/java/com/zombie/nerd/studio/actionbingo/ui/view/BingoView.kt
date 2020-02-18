package com.zombie.nerd.studio.actionbingo.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.widget.GridLayout
import android.widget.TextView
import com.zombie.nerd.studio.actionbingo.R

class BingoView(context: Context, attrs: AttributeSet) : GridLayout(context, attrs) {

    private var cellCount = 0
    private var cells = mutableListOf<TextView>()

    init {
        val a = context.theme.obtainStyledAttributes(attrs, R.styleable.BingoView, 0, 0)
        try {
            cellCount = a.getInteger(R.styleable.BingoView_cellCount, 0)
        } finally {
            a.recycle()
        }

        createCells()
    }

    private fun createCells() {
        columnCount = cellCount
        rowCount = cellCount

        for (i in 1..cellCount * cellCount) {
            val textView = createTextView()
            textView.text = i.toString()
            this.addView(textView).also { cells.add(textView) }
        }
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

        val textViewParams = LayoutParams(spec(UNDEFINED, FILL,1f), spec(UNDEFINED, FILL,1f))
//        textViewParams.width = LayoutParams.MATCH_PARENT
//        textViewParams.height = LayoutParams.MATCH_PARENT
//        textViewParams.setGravity(Gravity.CENTER)
        textView.layoutParams = textViewParams
        return textView
    }
}