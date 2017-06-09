package com.notahelloworld.kotlin.functions

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.notahelloworld.kotlin.R

class LoginActivity1 : Activity() {

  val button by lazy { findViewById(R.id.search_button) as Button }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    button.setOnClickListener {
      Toast.makeText(this@LoginActivity1, "Button 1",
          Toast.LENGTH_LONG).show()
    }
  }

}
