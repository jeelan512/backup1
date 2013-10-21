package com.bt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonListenerDemo2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void viewMessage(View view){
    	Toast.makeText(getApplicationContext(), "U CLICKED BUTTON", 5000).show();
    }
}