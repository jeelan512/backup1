package com.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PredefinedByVendors extends Activity implements OnClickListener {
    Button dial;
    Button browser;
    Button call;
    Button camera;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        dial=(Button)findViewById(R.id.dial);
        dial.setOnClickListener(this);
    
        browser=(Button)findViewById(R.id.br);
        browser.setOnClickListener(this);
    
        call=(Button)findViewById(R.id.call);
        call.setOnClickListener(this);
    
        camera=(Button)findViewById(R.id.camera);
        camera.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.dial:
			Intent intent1=new Intent(Intent.ACTION_DIAL);
			startActivity(intent1);
			break;
			
			
		case R.id.br:
			Intent intent2=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.durgajobs.com"));
			startActivity(intent2);
			break;
			
			
		case R.id.call:
			Intent intent3=new Intent(Intent.ACTION_CALL, Uri.parse("tel:8096969696"));
			startActivity(intent3);
			break;
			
			
		case R.id.camera:
			Intent intent4=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivity(intent4);
			break;

		default:
			break;
		}
	}
}