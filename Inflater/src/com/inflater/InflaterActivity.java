package com.inflater;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class InflaterActivity extends Activity {
    Button bt;
    TextView tv;
    LayoutInflater inflater;
    LinearLayout layout;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        bt=(Button)inflater.inflate(R.layout.button, null);
        
        layout=(LinearLayout)findViewById(R.id.linear);
        layout.addView(bt);
        
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv=(TextView)inflater.inflate(R.layout.text, null);
				layout.addView(tv);
			
			}
		});
    
    
    
    }
}