package com.check;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxListenerDemo extends Activity {
    CheckBox c;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        c=(CheckBox)findViewById(R.id.check);
        
        /*c.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(c.isChecked()){
					Toast.makeText(getApplicationContext(), "Text Of Check Box..."+c.getText(),5000).show();
				}
				
				else {
					Toast.makeText(getApplicationContext(), "Check Box Is UnChecked",5000).show();
				}
			}
		});*/
        
        c.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(c.isChecked()){
					Toast.makeText(getApplicationContext(), "U CHECKED CHECK BOX",5000).show();
				}
				
				else {
					Toast.makeText(getApplicationContext(), "CHECK BOX IS UNCHECKED",5000).show();
				}
			}
		});
    
    
    
    }
}