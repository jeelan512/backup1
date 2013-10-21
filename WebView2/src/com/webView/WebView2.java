package com.webView;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView2 extends Activity {
    WebView web1,web2;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        web1=(WebView)findViewById(R.id.web1);
        
        //web1.loadUrl("file:///android_asset/ic_launcher.png");
        web1.loadData("<html><body><b><i><font color='red' size='20'>Html String</font></i></b></body></html>","text/html","UTF-8");
        
        web2=(WebView)findViewById(R.id.web2);
        web2.getSettings().setJavaScriptEnabled(true);
        web2.getSettings().setBuiltInZoomControls(true);
        
        web2.loadUrl("file:///android_asset/one.html");
    
    
    
    }
}