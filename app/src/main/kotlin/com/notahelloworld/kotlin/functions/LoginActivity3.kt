package com.notahelloworld.kotlin.functions

import android.app.Activity
import android.graphics.Color.BLACK
import android.graphics.Color.GREEN
import android.graphics.Color.WHITE
import android.graphics.Color.YELLOW
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.notahelloworld.kotlin.R

class LoginActivity3 : Activity() {

  val button by lazy { findViewById(R.id.search_button) as Button }

  private val colors = hashMapOf(
      "amarelo" to YELLOW,
      "branco" to WHITE,
      "verde" to GREEN,
      "preto" to BLACK
  )

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val backgroundForButton = button to R.color.colorPrimary

    Log.d(javaClass.canonicalName, "${backgroundForButton.first} ${backgroundForButton.second} ")
  }

}
