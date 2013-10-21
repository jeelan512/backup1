package com.toggle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonListenerDemo extends Activity {
    ToggleButton tb;
	EditText et;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tb=(ToggleButton)findViewById(R.id.tb);
        et=(EditText)findViewById(R.id.edit);
        /*tb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(tb.isChecked()){
					et.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}
				
				else {
					et.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});*/
        
        tb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(tb.isChecked()){
					Toast.makeText(ToggleButtonListenerDemo.this,"Toggle Button Is Cheched.."+tb.getText(),5000).show();
				}
				
				else{
					Toast.makeText(ToggleButtonListenerDemo.this,"Toggle Button Is UnCheched.."+tb.getText(),5000).show();
				}
			}
		});
    
    }
}