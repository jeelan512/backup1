package com.viewFlipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ViewFliperDemo2 extends Activity {
    ViewFlipper vf;
    Button previous,next;
    Animation anim1,anim2;
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        vf=(ViewFlipper)findViewById(R.id.vf);
        
        anim1=AnimationUtils.loadAnimation(this, R.anim.custom1);
        anim2=AnimationUtils.loadAnimation(this, R.anim.custom2);
    
    
        vf.setInAnimation(anim1);
        vf.setOutAnimation(anim2);
        
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