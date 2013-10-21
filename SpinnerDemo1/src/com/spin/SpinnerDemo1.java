package com.spin;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SpinnerDemo1 extends Activity {
    Spinner s;
    String[] values;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Resources res=getResources();
        values=res.getStringArray(R.array.values);
    
        s=(Spinner)findViewById(R.id.spin);
        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.style,values);
        
        s.setAdapter(adapter);
        
        s.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				TextView tv=(TextView)arg1;
				Toast.makeText(getApplicationContext(), "Selected Text Is..."+tv.getText(),Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
    }
}