package com.viewFlipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ViewFlipperDemo1 extends Activity {
    ViewFlipper vf;
    Button next,previous;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        vf=(ViewFlipper)findViewById(R.id.vf);
        
        next=(Button)findViewById(R.id.next);
        
        next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			vf.showNext();	
			}
		});
        
        
        previous=(Button)findViewById(R.id.previous);
        previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			vf.showPrevious();	
			}
		});
    
    
    }
}