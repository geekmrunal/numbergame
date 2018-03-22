package com.android.kmrunal.numbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentNumber = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increments number and also change background and text colour
     * @param v
     */
    public void updateNumber(View v){
        if(currentNumber < 9 )
            currentNumber = currentNumber + 1;
        else
            currentNumber = 0;
     displayNumber(currentNumber);
    }
  
  /**
    * Displays number 
    * @param number 
    */
    
    public void displayNumber(int number )
    {
        TextView nextScr = (TextView) findViewById(R.id.number_text);
        nextScr.setText(String.valueOf(number));

    }
    
  /**
    * Resets  number to zero
    * @param number 
    */
    public void ResetNumber(View v){
        currentNumber = 0;
        displayNumber(currentNumber);
    }
}
