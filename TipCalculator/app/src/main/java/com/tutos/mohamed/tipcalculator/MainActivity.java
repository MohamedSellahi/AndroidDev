// MainActivity.java
// Calculates a bill total based on a tip percentage
package com.tutos.mohamed.tipcalculator;

import android.app.Activity;
import android.os.Bundle; // for saving state information
import android.support.v7.app.AppCompatActivity; // base class
import android.text.Editable; // For edit text event handling (Interface)
import android.text.TextWatcher; // Edit text listener (Interface)
import android.widget.EditText;
import android.widget.SeekBar; // For changing the tip percentage
import android.widget.SeekBar.OnSeekBarChangeListener; // SeekBAr listener (Interface)
import android.widget.TextView;

import java.text.NumberFormat; // for currency formatting

public class MainActivity extends Activity {
   // Currency and percent formatting objects
   private static final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
   private static final NumberFormat percentFormat = NumberFormat.getNumberInstance();

   private double billAmount = 0.0;
   private double percent = 0.15; // initial tip percenatage
   private TextView amountTextView;
   private TextView percentTextView;
   private TextView tipTextView;
   private TextView totalTextView;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState); // call superclass version : mendatory
      setContentView(R.layout.activity_main); // Inflater the GUI

      // get references to programmatically manipulate views
      amountTextView = (TextView)findViewById(R.id.ammountTextView);
      percentTextView = (TextView)findViewById(R.id.percentTextView);
      tipTextView = (TextView)findViewById(R.id.tipTextView);
      totalTextView = (TextView)findViewById(R.id.totalTextView);
      tipTextView.setText(currencyFormat.format(0));
      totalTextView.setText(percentFormat.format(0));

      // set ammount edit text ' textWatcher
      EditText amountEditText = (EditText)findViewById(R.id.amountEditText);
//      TextWatcher amountEditTextWatecher;
        amountEditText.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
        });

      // set percentage seek bar
      SeekBar percentSeekBar = (SeekBar)findViewById(R.id.percentSeekBar);
      percentSeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
         @Override
         public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

         }

         @Override
         public void onStartTrackingTouch(SeekBar seekBar) {

         }

         @Override
         public void onStopTrackingTouch(SeekBar seekBar) {

         }
      });


   }
}
