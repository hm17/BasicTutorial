package com.hm.basictutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Sends a message when button is pressed.
     */
    public void sendMessage(View view) {
        // Do something
        System.out.println("Hello WORLD!");
    }
}
