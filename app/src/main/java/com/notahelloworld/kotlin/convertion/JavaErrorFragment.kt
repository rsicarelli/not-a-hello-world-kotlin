package com.notahelloworld.kotlin.convertion

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.notahelloworld.kotlin.R

class JavaErrorFragment : Fragment() {

  internal var onServerErrorFragmentListener: OnServerErrorFragmentListener? = null

  override fun onAttach(context: Context?) {
    super.onAttach(context)

    if (context is OnServerErrorFragmentListener) {
      onServerErrorFragmentListener = context as OnServerErrorFragmentListener?
    }
  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    val view = inflater!!.inflate(R.layout.fragment_error, container, false)

    val tryAgain = view.findViewById(R.id.try_again) as Button
    tryAgain.setOnClickListener {
      if (onServerErrorFragmentListener != null) {
        onServerErrorFragmentListener!!.onTryAgainClick()
      } else {
        activity.finish()
      }
    }

    return view
  }

  interface OnServerErrorFragmentListener {
    fun onTryAgainClick()
  }

  companion object {

    fun newInstance(): JavaErrorFragment {
      return JavaErrorFragment()
    }
  }
}
