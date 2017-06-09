package com.notahelloworld.kotlin.extensions

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.FrameLayout
import com.notahelloworld.kotlin.R

class AlertActivity1 : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_alert)

    val container = findViewById(R.id.container) as FrameLayout

    Snackbar.make(
        container,
        R.string.alert_message,
        Snackbar.LENGTH_SHORT
    ).showCustomizedSnackBar(R.color.colorAccent, Color.WHITE)

  }

}
