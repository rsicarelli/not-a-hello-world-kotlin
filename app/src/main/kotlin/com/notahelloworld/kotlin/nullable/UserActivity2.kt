package com.notahelloworld.kotlin.nullable

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout
import com.notahelloworld.kotlin.R
import com.notahelloworld.kotlin.view.UserView

class UserActivity2 : Activity() {

  val container by lazy { findViewById(R.id.container) as FrameLayout }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val userName = UserRepository().getUserName(123)

    addUserNameView(userName)

  }

  private fun addUserNameView(userName: String?) {
    val name = userName ?: "John Doe"
    container.addView(UserView(name = name, context = this))
  }


}
