package com.notahelloworld.kotlin.functions

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import com.notahelloworld.kotlin.R

class LoginActivity2 : Activity() {

  val button by lazy { findViewById(R.id.search_button) as Button }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val height = getHeight()
  }

  fun getHeight() = button.height
}
