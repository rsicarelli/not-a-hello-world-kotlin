package com.notahelloworld.kotlin.variables

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

//smart cast
class UserViewModel4(
    @StringRes val text: Int,
    @ColorRes val textColor: Int
) {

  var backgroundColor = R.color.default_color

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

  fun setBackgroundColor(background: Drawable) {
    if (background is ColorDrawable) {
      backgroundColor = background.color
    }
  }
}
