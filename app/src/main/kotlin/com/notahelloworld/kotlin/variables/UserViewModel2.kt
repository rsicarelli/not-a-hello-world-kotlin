package com.notahelloworld.kotlin.variables

import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

//type inference
class UserViewModel2(
    @StringRes val text: Int,
    @ColorRes val textColor: Int
) {

  val defaultString = R.string.default_text
  val defaultTextColor = R.color.default_color

  fun toViewModel(
      @StringRes text: Int = defaultString,
      @ColorRes textColor: Int = defaultTextColor
  ): UserViewModel1 {
    return UserViewModel1(text, textColor)
  }

}
