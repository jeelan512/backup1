package com.radioGroup;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class RadioGroupListenerDemoActivity extends Activity {
    RadioGroup rg;
    RadioButton rb;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        rg=(RadioGroup)findViewById(R.id.rg1);
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				rb=(RadioButton)findViewById(group.getCheckedRadioButtonId());
			
				Toast.makeText(getApplicationContext(), "Checked Radio Button Text Is..."+rb.getText(), Toast.LENGTH_LONG).show();
			
			
			}
		});
    
    
    
    
    }
}