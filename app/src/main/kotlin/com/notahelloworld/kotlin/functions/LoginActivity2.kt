package com.notahelloworld.kotlin.functions

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import com.notahelloworld.kotlin.R
import com.notahelloworld.kotlin.extensions.hide

class LoginActivity2 : Activity() {

  val button by lazy { findViewById(R.id.search_button) as Button }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    hideButton()
  }

  fun hideButton() = button.hide()
}
