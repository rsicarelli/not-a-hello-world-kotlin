package com.notahelloworld.kotlin.nullable

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout
import com.notahelloworld.kotlin.R
import com.notahelloworld.kotlin.view.UserView

class UserActivity4 : Activity() {

  val container by lazy { findViewById(R.id.container) as FrameLayout }
  val spacing by lazy { resources.getDimensionPixelSize(R.dimen.key_line) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val userName = UserRepository().getUserName(123)

    userName?.let {
      container.addView(UserView(name = it, context = this, spacing = spacing))
    }
  }
}
