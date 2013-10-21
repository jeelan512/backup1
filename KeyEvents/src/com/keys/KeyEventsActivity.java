package com.keys;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class KeyEventsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		switch (keyCode) {
		case KeyEvent.KEYCODE_0:
			Toast.makeText(getApplicationContext(), "U CLICKED 0 KEY",5000).show();
			break;
			
		case KeyEvent.KEYCODE_CALL:
			Toast.makeText(getApplicationContext(), "U CLICKED CALL KEY",5000).show();
			break;
			
		case KeyEvent.KEYCODE_S:
			Toast.makeText(getApplicationContext(), "U CLICKED S KEY",5000).show();
			break;
			
		case KeyEvent.KEYCODE_BACK:
			Toast.makeText(getApplicationContext(), "U CLICKED BACK KEY",5000).show();
			
		
		
		
		default:
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		return true;
	}
}


