package com.zombie.nerd.studio.actionbingo.ui.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import com.zombie.nerd.studio.actionbingo.R
import java.lang.Exception

class BingoView2(context: Context, private var cellCount: Int = 0) : LinearLayout(context) {

//    private var attrs: AttributeSet? = null

    private var cells = mutableListOf<TextView>()

    //    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
//        this.attrs = attrs
//    }
//
//    constructor(context: Context, attrs: AttributeSet, cellCount: Int = 0) : super(context, attrs) {
//        this.cellCount = cellCount
//        this.attrs = attrs
//    }

    init {
//        if (cellCount == 0) {
//            val a = context.theme.obtainStyledAttributes(attrs, R.styleable.BingoView2, 0, 0)
//            try {
//                cellCount = a.getInteger(R.styleable.BingoView2_cellCount, 0)
//            } catch (e: Exception) {
//                a.recycle()
//            }
//        }

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