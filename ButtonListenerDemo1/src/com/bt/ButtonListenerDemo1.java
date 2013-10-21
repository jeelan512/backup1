package com.bt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ButtonListenerDemo1 extends Activity {
    EditText et1,et2;
    Button bt;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        et1=(EditText)findViewById(R.id.edit1);
        et2=(EditText)findViewById(R.id.edit2);
        
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				et2.setText("Hello..."+et1.getText());
			}
		});
    
    
    }
}