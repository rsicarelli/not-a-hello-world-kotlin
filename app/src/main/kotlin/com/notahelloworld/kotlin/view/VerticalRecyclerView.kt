package com.notahelloworld.kotlin.view

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet

class VerticalRecyclerView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RecyclerView(context, attributeSet, defStyleAttr) {

  init {
    val layoutManager = LinearLayoutManager(context)
    layoutManager.orientation = LinearLayoutManager.VERTICAL
    setLayoutManager(layoutManager)
  }
}
