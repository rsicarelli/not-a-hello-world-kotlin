package com.notahelloworld.kotlin.variables

import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

class UserViewModel1(
    @StringRes val text: Int,
    @ColorRes val textColor: Int
) {

  fun toViewModel(
      @StringRes text: Int = R.string.default_text,
      @ColorRes textColor: Int = R.color.colorAccent
  ): UserViewModel1 {
    return UserViewModel1(text, textColor)
  }

}
