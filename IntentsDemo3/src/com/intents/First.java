package com.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First extends Activity {
    Button implicit;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        implicit=(Button)findViewById(R.id.button1);
        implicit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setAction("action1");
				intent.setAction("action2");
				intent.addCategory("catagery1");
				intent.addCategory("catagery2");
				startActivity(intent);
			}
		});
        
        
    }
}