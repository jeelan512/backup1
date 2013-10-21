package com.database;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class First extends Activity {
    Button bt;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        //create the data base
        SharedPreferences shared=getSharedPreferences("shared", MODE_WORLD_WRITEABLE);
        
        //edit the data base
        Editor e=shared.edit();
        
        //store the data
        e.putString("key1", "welcome");
        e.putInt("key2", 10);
        e.putBoolean("key3", true);
        e.putFloat("key4", 10.1f);
        e.putLong("key5", 10000);
        
        //commit the data
        e.commit();
        
        
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(First.this, Second.class);
				startActivity(intent);
			}
		});
    
    
    }
}