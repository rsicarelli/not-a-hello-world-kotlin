package com.notahelloworld.kotlin.extensions

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout
import com.notahelloworld.kotlin.R

class AlertActivity2 : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_alert)

    val first = findViewById(R.id.first) as LinearLayout
    val second = findViewById(R.id.second) as LinearLayout
    val third = findViewById(R.id.third) as LinearLayout
    val fourth = findViewById(R.id.fourth) as LinearLayout

    first.fadeOut().start()
    second.fadeIn().start()
    third.translateYAnimator(123F).start()
    fourth.rotate(180f).start()

    first.show()
    second.hide()
    third.gone()
  }
}
