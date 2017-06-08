package com.notahelloworld.kotlin.view

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

class UserView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    val name: String = ""
) : TextView(context, attributeSet, defStyleAttr) {


}
