package com.tabView;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabViewDemo extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        
        TabHost th=getTabHost();
        
        TabSpec ts1=th.newTabSpec("tab1");
        ts1.setIndicator("Photos", getResources().getDrawable(R.drawable.photos));
        Intent intent1=new Intent(TabViewDemo.this, Photos.class);
        ts1.setContent(intent1);
        th.addTab(ts1);
        
       
       
        TabSpec ts2=th.newTabSpec("tab2");
        ts2.setIndicator("Songs", getResources().getDrawable(R.drawable.songs));
        Intent intent2=new Intent(TabViewDemo.this,Songs.class);
        ts2.setContent(intent2);
        th.addTab(ts2);

        TabSpec ts3=th.newTabSpec("tab3");
        ts3.setIndicator("Videos", getResources().getDrawable(R.drawable.videos));
        Intent intent3=new Intent(TabViewDemo.this,Videos.class);
        ts3.setContent(intent3);
        th.addTab(ts3);

    
    
    
    }
}