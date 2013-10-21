package com.media;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
	MediaPlayer mp;
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Media Player Reference Is Created", 5000).show();
		mp=MediaPlayer.create(getApplicationContext(), R.raw.saptaswara);
		
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Service Stopped", 5000).show();
		mp.stop();
		
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Service Started", 5000).show();
		mp.start();
		
	}
	
	
    
}