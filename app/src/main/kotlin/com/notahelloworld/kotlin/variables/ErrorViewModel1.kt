package com.notahelloworld.kotlin.variables

import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

class ErrorViewModel1 {

  fun toViewModel(
      @StringRes text: Int = R.string.default_text,
      @ColorRes textColor: Int = R.color.colorAccent
  ): ErrorViewModel1 {
    return ErrorViewModel1()
  }

}
