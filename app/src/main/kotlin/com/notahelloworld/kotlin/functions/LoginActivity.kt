package com.notahelloworld.kotlin.functions

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.notahelloworld.kotlin.R

class LoginActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val button = findViewById(R.id.search_button) as Button

    button.setOnClickListener(object : View.OnClickListener {
      override fun onClick(view: View): Unit {
        Toast.makeText(this@LoginActivity, "Button 1",
            Toast.LENGTH_LONG).show()
      }
    })

  }

}
