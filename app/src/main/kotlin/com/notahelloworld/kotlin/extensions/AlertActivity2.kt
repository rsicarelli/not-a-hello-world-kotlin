package com.notahelloworld.kotlin.extensions

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout
import com.notahelloworld.kotlin.R

class AlertActivity2 : Activity() {

  val container by lazy { findViewById(R.id.container) as LinearLayout }
  val first by lazy { findViewById(R.id.first) as LinearLayout }
  val second by lazy { findViewById(R.id.second) as LinearLayout }
  val third by lazy { findViewById(R.id.third) as LinearLayout }
  val fourth by lazy { findViewById(R.id.fourth) as LinearLayout }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_alert)

    first.fadeOut().start()
    second.fadeIn().start()
    third.translateYAnimator(123F).start()
    fourth.rotate(180f).start()

    first.show()
    second.hide()
    third.gone()
  }
}
