package com.notahelloworld.kotlin.nullable

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout
import com.notahelloworld.kotlin.R
import com.notahelloworld.kotlin.view.UserView

class UserActivity2 : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val userName = JavaUserRepository().getUserName(123)

    val container = findViewById(R.id.container) as FrameLayout

    val name = userName ?: "John Doe"
    container.addView(UserView(name = name, context = this))
  }

}
