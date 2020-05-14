package com.example.dotsandboxesgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Button button = (Button) findViewById(R.id.button) ;
        button.setOnClickListener(new View.OnClickListener() {
                                      // The code in this method will be executed when the numbers category is clicked on.
                                      public void onClick(View view) {
                                          // Create a new intent to open the {@link NumbersActivity}
                                          Intent numbersIntent = new Intent(MainActivity.this, CustomViewActivity.class);

                                          // Start the new activity
                                          startActivity(numbersIntent);
                                      }
                                  });


        Button button3 = (Button) findViewById(R.id.button3) ;
        button3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbers3Intent = new Intent(MainActivity.this, Computer3x3Activity.class);

                // Start the new activity
                startActivity(numbers3Intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2) ;
        button2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbers2Intent = new Intent(MainActivity.this, Grid5x5Activity.class);

                // Start the new activity
                startActivity(numbers2Intent);
            }
        });

//        InputMethodManager inputManager = (InputMethodManager)
//                getSystemService(Context.INPUT_METHOD_SERVICE);
//
//        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
//                InputMethodManager.HIDE_NOT_ALWAYS);

    }





}
