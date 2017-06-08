package com.notahelloworld.kotlin.variables

import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

class ErrorViewModel2(
    @StringRes val text: Int,
    @ColorRes val textColor: Int
) {

  val defaultString = R.string.default_text
  val defaultTextColor = R.color.default_color

  fun toViewModel(
      @StringRes text: Int = defaultString,
      @ColorRes textColor: Int = defaultTextColor
  ): ErrorViewModel1 {
    return ErrorViewModel1(text, textColor)
  }

}
