package com.webView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class WebView1Activity extends Activity {
    Button bt;
    WebView web;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
    
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			web=(WebView)findViewById(R.id.web);
			web.loadUrl("www.durgajobs.com");
			}
		});
    
    
    }
}