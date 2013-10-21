package com.broadcast;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BroadCastReciverDemo extends Activity {
    Button bt;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=
					new Intent(BroadCastReciverDemo.this, 
							MyBroadCastReceiver.class);
				PendingIntent pi=
					PendingIntent.getBroadcast(
					getApplicationContext(), 0, intent, 0);
			
			
				EditText et=(EditText)findViewById(R.id.alarm);
				int i=Integer.parseInt(et.getText().toString());
				
				AlarmManager alarm=(AlarmManager)getSystemService(ALARM_SERVICE);
				alarm.set(AlarmManager.RTC_WAKEUP, 
						System.currentTimeMillis()+(i*1000), pi);
				
			
			}
		});
    }
    
}