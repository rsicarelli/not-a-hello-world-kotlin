package com.notahelloworld.kotlin.view

import android.app.Activity
import android.content.Context
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.TextAppearanceSpan
import android.util.AttributeSet
import android.widget.TextView
import com.notahelloworld.kotlin.R

class SpannableTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : TextView(context, attrs, defStyle) {

  fun setSpannableText(vararg texts: SpannableStyle) {
    val builder = SpannableStringBuilder()

    texts.forEach {
      builder.apply {
        append(convertToSpannableString(it)).append(" ")
      }
    }

    text = builder.subSequence(0, builder.length).trim()
  }

  fun convertToSpannableString(spannableStyle: SpannableStyle): SpannableString {
    return SpannableString(spannableStyle.text).apply {
      setSpan(TextAppearanceSpan(context, spannableStyle.style), 0, spannableStyle.text.length, 0)
    }
  }

  class SpannableStyle(val text: String, val style: Int)
}

class SpannableActivity : Activity() {

  val someText by lazy { findViewById(R.id.title) as SpannableTextView }

  fun showTitleText(preambleText: String, titleText: String) {
    val first = SpannableTextView.SpannableStyle(preambleText, R.style.LightText)
    val second = SpannableTextView.SpannableStyle(titleText, R.style.MediumText)

    this.someText.setSpannableText(first, second)
  }

}
