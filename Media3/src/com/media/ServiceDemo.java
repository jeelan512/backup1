package com.media;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ServiceDemo extends Activity {
    Button start,stop;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        start=(Button)findViewById(R.id.start);
        start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startService(new Intent(getApplicationContext(), MyService.class));
			}
		});
        
        stop=(Button)findViewById(R.id.stop);
        stop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				stopService(new Intent(getApplicationContext(), MyService.class));
			}
		});
    
    
    }
}