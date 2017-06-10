package com.notahelloworld.kotlin.functions

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.notahelloworld.kotlin.R
import com.notahelloworld.kotlin.nullable.UserActivity1

class LoginActivity2 : Activity() {

  val button by lazy { findViewById(R.id.search_button) as Button }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val height = getHeight()

    button.height = height

    navigate<UserActivity1>("123")
  }

  fun getHeight() = button.height

  inline fun <reified T : Activity> Activity.navigate(id: String) {
    val intent = Intent(this, T::class.java)
    intent.putExtra("id", id)
    startActivity(intent)
  }
}
