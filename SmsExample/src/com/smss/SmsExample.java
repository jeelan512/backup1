package com.smss;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsExample extends Activity {
    Button send;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        send=(Button)findViewById(R.id.send);
        
        send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText et1=(EditText)findViewById(R.id.phno);
				String phno=et1.getText().toString();
				
				
				EditText et2=(EditText)findViewById(R.id.message);
				String message=et2.getText().toString();
				
				SmsManager manager=SmsManager.getDefault();
				manager.sendTextMessage(phno, null, message, null, null);
				Toast.makeText(getApplicationContext(),"Message Sent Successfully", 5000).show();
			
			}
		});
    
    
    
    }
}