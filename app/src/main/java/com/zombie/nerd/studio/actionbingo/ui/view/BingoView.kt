package com.zombie.nerd.studio.actionbingo.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.zombie.nerd.studio.actionbingo.R

class BingoView(context: Context, attrs: AttributeSet) : GridLayout(context, attrs) {

    private var cellCount = 0

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
        val layoutParams = LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT, 1f)
        layoutParams.gravity = Gravity.CENTER
//        val params = LayoutParams(spec(UNDEFINED, 1f), spec(UNDEFINED, 1f))

//        val params = LayoutParams(spec(UNDEFINED, FILL,1f), spec(UNDEFINED, FILL,1f))
//        params.width = 0
//        params.height = 0

        val gridParams = GridLayout.LayoutParams()
        gridParams.height = LayoutParams.MATCH_PARENT
        gridParams.width = LayoutParams.MATCH_PARENT
        gridParams.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, FILL, 1f)
        gridParams.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, FILL,1f)
//        this.layoutParams = gridParams

        columnCount = cellCount
        rowCount = cellCount
        for (i in 1..cellCount * cellCount) {
            val textView = TextView(context)
            textView.layoutParams = gridParams
            textView.text = i.toString()
            addView(textView)
        }
    }
}