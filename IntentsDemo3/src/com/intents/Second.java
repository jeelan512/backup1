package com.intents;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class Second extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView tv=new TextView(this);
        tv.setText("This Is second Screen");
        tv.setTextColor(Color.RED);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        
        
        
        setContentView(tv);
    }
}