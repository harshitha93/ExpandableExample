package com.example.harshitha.expandableexample;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by harshu on 10/29/2015.
 */
public class Next extends AppCompatActivity {

    Toolbar tb1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb1 = (Toolbar) findViewById(R.id.toolbar);
        if (tb1 != null)
            setSupportActionBar(tb1);

        final ActionBar actionBar = getSupportActionBar();
        // actionbar.setHomeAsUpIndicator(R.drawable.icon_history);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Next!!!");
    }
}