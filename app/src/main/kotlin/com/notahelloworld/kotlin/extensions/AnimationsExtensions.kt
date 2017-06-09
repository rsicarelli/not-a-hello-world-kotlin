package com.notahelloworld.kotlin.extensions

import android.animation.ObjectAnimator
import android.view.View

fun View.fadeTo(value: Float): ObjectAnimator {
  return ObjectAnimator.ofFloat(this, View.ALPHA, value)
}

fun View.fadeOut(): ObjectAnimator {
  return fadeTo(0.0f)
}

fun View.fadeIn(): ObjectAnimator {
  return fadeTo(1.0f)
}

fun View.translateYAnimator(value: Float): ObjectAnimator {
  return ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, value)
}

fun View.rotate(value: Float): ObjectAnimator {
  return ObjectAnimator.ofFloat(this, View.ROTATION, value)
}
