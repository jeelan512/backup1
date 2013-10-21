package com.media;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class Media1 extends Activity implements OnClickListener{
    Button btn1,btn2,btn3,btn4,btn5;
    ProgressBar pb;
    MediaPlayer mp;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn1=(Button)findViewById(R.id.play);
        btn2=(Button)findViewById(R.id.pause);
        btn3=(Button)findViewById(R.id.stop);
        btn4=(Button)findViewById(R.id.fwd);
        btn5=(Button)findViewById(R.id.bwd);
    
    
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        
        mp=MediaPlayer.create(getApplicationContext(), R.raw.saptaswara);
        
        pb=(ProgressBar)findViewById(R.id.progress);
        pb.setProgress(0);
        pb.setMax(mp.getDuration());
    }
    
    
    class MyThread extends Thread{
    	public void run(){
    		if(mp.getCurrentPosition()<mp.getDuration()){
    			pb.setProgress(mp.getCurrentPosition());
    		
    			try {
					sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
    		
    		}
    	}
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.play:
			if(btn3.isClickable()){
				
			}
			else {
				mp=MediaPlayer.create(getApplicationContext(), R.raw.saptaswara);
			}
			mp.start();
			new MyThread().start();
			break;
			
			
		case R.id.pause:
			mp.pause();
			break;
		case R.id.stop:
			mp.stop();
			break;
			
		case R.id.fwd:
			if(mp.getCurrentPosition()+5000<mp.getDuration()){
				mp.seekTo(mp.getCurrentPosition()+5000);
				pb.setProgress(mp.getCurrentPosition()+5000);
			}
			else {
				mp.seekTo(mp.getDuration());
				pb.setProgress(mp.getDuration());
			}
			
			
			break;
			
		case R.id.bwd:
			if(mp.getCurrentPosition()-5000>0){
				mp.seekTo(mp.getCurrentPosition()-5000);
				pb.setProgress(mp.getCurrentPosition()-5000);
			}
			
			else {
				mp.seekTo(0);
				pb.setProgress(0);
			}

		default:
			break;
		}
	}
}