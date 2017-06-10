package com.notahelloworld.kotlin.variables

import android.support.annotation.ColorRes
import android.support.annotation.StringRes
import com.notahelloworld.kotlin.R

// default values
class UserViewModel1(
    @StringRes val text: Int,
    @ColorRes val color: Int
) {

  fun doSomething(){
    val toViewModel = toViewModel()
    toViewModel.color
  }

  fun toViewModel(
      @StringRes text: Int = R.string.default_text,
      @ColorRes color: Int = R.color.colorAccent
  ): UserViewModel1 {
    return UserViewModel1(text, color)
  }

}
