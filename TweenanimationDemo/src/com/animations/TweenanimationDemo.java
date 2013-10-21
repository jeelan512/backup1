package com.animations;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class TweenanimationDemo extends Activity {
    Animation anim;
    TextView tv;
    ImageView iv;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        anim=AnimationUtils.loadAnimation(this,R.anim.custom);
        
        tv=(TextView)findViewById(R.id.text);
        iv=(ImageView)findViewById(R.id.iv);
        
        tv.startAnimation(anim);
        iv.startAnimation(anim);
        
        
    
    
    }
}