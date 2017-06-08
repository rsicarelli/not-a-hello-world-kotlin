package com.notahelloworld.kotlin.convertion;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.notahelloworld.kotlin.R;

public class ErrorFragment extends Fragment {

  OnServerErrorFragmentListener onServerErrorFragmentListener;

  public static ErrorFragment newInstance() {
    return new ErrorFragment();
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);

    if (context instanceof OnServerErrorFragmentListener) {
      onServerErrorFragmentListener = (OnServerErrorFragmentListener) context;
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_error, container, false);

    Button tryAgain = ((Button) view.findViewById(R.id.try_again));
    tryAgain.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (onServerErrorFragmentListener != null) {
          onServerErrorFragmentListener.onTryAgainClick();
        } else {
          getActivity().finish();
        }
      }
    });

    return view;
  }

  public interface OnServerErrorFragmentListener {
    void onTryAgainClick();
  }
}
