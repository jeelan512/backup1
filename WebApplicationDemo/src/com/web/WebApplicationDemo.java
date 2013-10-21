package com.web;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WebApplicationDemo extends Activity {
    Button read;
    TextView tv;
    String response;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        read=(Button)findViewById(R.id.read);
        read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				try {
					URL url=new URL("http://192.168.128.10:8080/WebAndroid/Android.jsp?uname=Android");
					InputStream is=url.openStream();
					
					BufferedReader reader=new BufferedReader(new InputStreamReader(is));
					response=reader.readLine();
					
					tv=(TextView)findViewById(R.id.text);
					tv.setText(response);
				} catch (Exception e) {
					// TODO: handle exception
				
					e.printStackTrace();
				}
					
			}
		});
    }
}