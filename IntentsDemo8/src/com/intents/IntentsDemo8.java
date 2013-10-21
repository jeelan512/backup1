package com.intents;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IntentsDemo8 extends Activity {
    Button start,stop;
    public static final int NOTIFICATION=1;
	NotificationManager nm;
	Notification notification;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notification=new Notification(R.drawable.ic_launcher, "Hai",System.currentTimeMillis());
        
        start=(Button)findViewById(R.id.start);
        start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String title="Click Me";
				String data="Visit Official Site Of Android";
				
				Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.android.com"));
				PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(), NOTIFICATION, intent,Intent.FLAG_ACTIVITY_NEW_TASK);
				notification.setLatestEventInfo(getApplicationContext(), title, data, pendingIntent);
				
				nm.notify(NOTIFICATION, notification);
			}
		});
        
        
        stop=(Button)findViewById(R.id.stop);
        stop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			nm.cancel(NOTIFICATION);	
			}
		});
        
    }
}