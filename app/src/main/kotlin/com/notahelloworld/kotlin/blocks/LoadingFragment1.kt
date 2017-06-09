package com.notahelloworld.kotlin.operators

import android.os.Bundle
import android.support.v4.app.Fragment

class LoadingFragment1 : Fragment() {

  companion object {
    private const val EXTRA_LOADING_MESSAGE = "extra_loading_message"
  }

  fun newInstance(loadingMessage: String): LoadingFragment1 {
    return LoadingFragment1().apply {
      arguments = Bundle().apply {
        putString(EXTRA_LOADING_MESSAGE, loadingMessage)
      }
    }
  }
}
