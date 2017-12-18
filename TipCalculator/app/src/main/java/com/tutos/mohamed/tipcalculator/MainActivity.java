// MainActivity.java
// Calculates a bill total based on a tip percentage
package com.tutos.mohamed.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle; // for saving state information
import android.text.Editable; // For edit text event handling
import android.text.TextWatcher; // Edit text listener
import android.widget.SeekBar; // For changing the tip percentage
import android.widget.SeekBar.OnSeekBarChangeListener; // SeekBAr listener
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }
}
