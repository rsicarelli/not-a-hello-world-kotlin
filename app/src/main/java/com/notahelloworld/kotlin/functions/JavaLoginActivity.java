package com.notahelloworld.kotlin.functions;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.notahelloworld.kotlin.R;

/**
 * Created by 99mobile on 09/06/17.
 */

public class JavaLoginActivity extends Activity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Button button = ((Button) findViewById(R.id.search_button));
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(JavaLoginActivity.this, "Button 1",
            Toast.LENGTH_LONG).show();
      }
    });

  }

}
