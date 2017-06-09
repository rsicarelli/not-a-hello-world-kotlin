package com.notahelloworld.kotlin.operators

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.notahelloworld.kotlin.R

class LoadingFragment2 : Fragment() {

  companion object {
    private const val EXTRA_LOADING_MESSAGE = "extra_loading_message"
  }

  fun newInstance(loadingMessage: String): LoadingFragment2 {
    return LoadingFragment2().apply {
      arguments = Bundle().apply {
        putString(EXTRA_LOADING_MESSAGE, loadingMessage)
      }
    }
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val view = inflater.inflate(R.layout.fragment_loading, container)

    val textMessage = arguments.getString(EXTRA_LOADING_MESSAGE)

    val loadingMessage = view.findViewById(R.id.loading_message) as TextView

    loadingMessage.run {
      text = textMessage
      textSize = 12f
    }

    return super.onCreateView(inflater, container, savedInstanceState)
  }

}
