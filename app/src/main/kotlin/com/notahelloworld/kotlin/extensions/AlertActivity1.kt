package com.notahelloworld.kotlin.extensions

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.notahelloworld.kotlin.R

class AlertActivity1 : Activity() {

  val container by lazy { findViewById(R.id.container) as LinearLayout }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_alert)

    Snackbar.make(
        container,
        R.string.alert_message,
        Snackbar.LENGTH_SHORT
    ).showCustomizedSnackBar(R.color.colorAccent, Color.WHITE)

  }

}
