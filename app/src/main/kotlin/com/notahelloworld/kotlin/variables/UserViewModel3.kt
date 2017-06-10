package com.notahelloworld.kotlin.variables

import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

//val var
class UserViewModel3(
    @StringRes val text: Int,
    @ColorRes val textColor: Int
) {

  var defaultString = R.string.default_text
  val defaultTextColor = R.color.default_color

  fun toViewModel(
      @StringRes text: Int = defaultString,
      @ColorRes textColor: Int = defaultTextColor
  ): UserViewModel1 {
    return UserViewModel1(text, textColor)
  }

  fun setDefaultText(default: Int) {
    defaultString = default
  }

}
