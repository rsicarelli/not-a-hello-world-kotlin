package com.notahelloworld.kotlin.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class MessageView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    val name: String = "John Doe"
) : LinearLayout(context, attributeSet, defStyleAttr) {

  lateinit var status: Status

  fun updateStatus(status: Status) {
    this.status = status
  }

}

class Status {
  var online: Boolean = false
}
