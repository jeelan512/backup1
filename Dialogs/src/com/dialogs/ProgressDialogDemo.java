package com.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProgressDialogDemo extends Activity {
	public static final int PROGRESS=1;
	Button bt;
	ProgressDialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progress);
		
		
		bt=(Button)findViewById(R.id.progress);
		bt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(PROGRESS);
			}
		});
		
		
		
	}
	
	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		dialog=new ProgressDialog(this);
		dialog.setIcon(R.drawable.ic_launcher);
		dialog.setTitle("progress");
		dialog.setMessage("please wait.....");
		
		
		new Thread(){
			public void run(){
				try {
					sleep(5000);
					dialog.cancel();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}.start();
		
		return dialog;
	}
	
	
	
}
