package com.progress;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarDemo extends Activity {
    ProgressBar pb;
    Button bt;
    int i=1000;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        pb=(ProgressBar)findViewById(R.id.progress);
        pb.setMax(10000);
        pb.setProgress(0);
        
        bt=(Button)findViewById(R.id.bt);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(i!=10000){
					pb.setProgress(i);
					i+=1000;
				}
				
				else {
					pb.setVisibility(View.GONE);
				}
				
			}
		});
    }
}