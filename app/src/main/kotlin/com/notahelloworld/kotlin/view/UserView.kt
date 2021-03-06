package com.notahelloworld.kotlin.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout

class UserView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    val name: String = "John Doe",
    val spacing: Int = 0
) : LinearLayout(context, attributeSet, defStyleAttr) {

}
