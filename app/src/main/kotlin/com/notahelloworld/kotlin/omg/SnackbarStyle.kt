package com.notahelloworld.kotlin.omg

import android.graphics.Color
import android.support.annotation.IdRes
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import com.notahelloworld.kotlin.R

class SnackbarStyle(
    @StringRes val textRes: Int,
    @IdRes val textColor: Int,
    @IdRes val backgroundColor: Int,
    val duration: Int
) {
  private constructor (builder: Builder) : this(builder.textRes, builder.textColor, builder.backgroundColor, builder.duration)

  class Builder(
      @StringRes val textRes: Int,
      @IdRes val textColor: Int,
      @IdRes val backgroundColor: Int,
      val duration: Int
  ) {

    fun build() = SnackbarStyle(this)
  }

  companion object {
    inline fun build(textRes: Int,
        textColor: Int,
        backgroundColor: Int,
        duration: Int,
        block: Builder.() -> Unit) = Builder(textRes, textColor, backgroundColor, duration).apply(block).build()
  }
}

class Show {
  fun getSnackbarStyle() = SnackbarStyle.build(
      textRes = R.string.default_text,
      textColor = Color.WHITE,
      backgroundColor = R.color.colorAccent,
      duration = Snackbar.LENGTH_LONG) {}
}
