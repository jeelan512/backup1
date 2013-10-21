package com.media;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Media2 extends Activity {
    VideoView v;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        v=(VideoView)findViewById(R.id.video);
        v.setVideoPath("/sdcard/sample2.mp4");
        
        v.setMediaController(new MediaController(this));
        v.start();
    }
}