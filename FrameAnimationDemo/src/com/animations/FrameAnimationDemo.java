package com.animations;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class FrameAnimationDemo extends Activity {
    ImageView iv;
    Button bt;
    AnimationDrawable draw;
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
				iv=(ImageView)findViewById(R.id.iv);
				iv.setBackgroundResource(R.drawable.custom);
				
				draw=(AnimationDrawable)iv.getBackground();
				if(draw.isRunning()){
					draw.stop();
				}
				else {
					draw.start();
				}
			}
		});
    
    
    }
}