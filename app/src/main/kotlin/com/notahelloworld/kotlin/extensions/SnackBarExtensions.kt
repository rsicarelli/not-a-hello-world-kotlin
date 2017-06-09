package com.notahelloworld.kotlin.extensions

import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.widget.TextView

fun Snackbar.showCustomizedSnackBar(backgroundColor: Int, textColor: Int) {
  this.view.setBackgroundColor(ContextCompat.getColor(context, backgroundColor))

  val snackBarText = this.view.findViewById(android.support.design.R.id.snackbar_text) as TextView
  snackBarText.setTextColor(textColor)

  this.show()
}

