package com.wifi;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WiFiExample extends Activity {
    WifiManager wifi;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void getDetails(View view){
    	wifi=(WifiManager)getSystemService(WIFI_SERVICE);
    	String result="";
    	
    	int i=wifi.getWifiState();
    	
    	if(i==WifiManager.WIFI_STATE_DISABLED){
    		wifi.setWifiEnabled(true);
    		result+="Enabled";
    	}
    	
    	else if(i==WifiManager.WIFI_STATE_ENABLED){
			wifi.setWifiEnabled(false);
			result+="Disabled";
    	}
    	
    	TextView tv=(TextView)findViewById(R.id.text);
    	tv.setText(result);
    }
}