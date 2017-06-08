package com.notahelloworld.kotlin.nullable

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout
import com.notahelloworld.kotlin.R
import com.notahelloworld.kotlin.view.UserView

class UserActivity1 : Activity() {

  val container by lazy { findViewById(R.id.container) as FrameLayout }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val userName = UserRepository().getUserName(123)

    addUserNameView(userName)

  }

  private fun addUserNameView(userName: String?) {
    userName?.let {
      container.addView(UserView(name = it, context = this))
    }
  }


}
