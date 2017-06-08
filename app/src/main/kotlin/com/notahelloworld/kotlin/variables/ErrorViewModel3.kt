package com.notahelloworld.kotlin.variables

import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

class ErrorViewModel3 {

  var defaultString = R.string.default_text
  val defaultTextColor = R.color.default_color

  fun toViewModel(
      @StringRes text: Int = defaultString,
      @ColorRes textColor: Int = defaultTextColor
  ): ErrorViewModel1 {
    return ErrorViewModel1()
  }

  fun setDefaultText(default: Int) {
    defaultString = default
  }

}
