package com.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First extends Activity {
    Button second;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        second=(Button)findViewById(R.id.second);
        second.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(First.this, Second.class);
				i.putExtra("key1", "welcome");
				i.putExtra("key2",10);
				i.putExtra("key3", true);
				i.putExtra("key4", 10.1f);
				i.putExtra("key5", 10.12345);
				startActivity(i);
			
			
			}
		});
    }
}