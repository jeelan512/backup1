package com.broadcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "Please Wake Up!",10000).show();
		Vibrator vibrator=(Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
		vibrator.vibrate(10000);
	
	}
    
}