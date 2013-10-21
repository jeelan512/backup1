package com.dialogs;

import java.util.Calendar;

import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

public class TimePickerDialogDemo extends Activity {
	Button bt;
	EditText et;
	public static final int TIME=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.time);
		
		bt=(Button)findViewById(R.id.bt);
		et=(EditText)findViewById(R.id.edit);
		
		
		bt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(TIME);
			}
		});
	}
	
	
	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		int chour=c.get(Calendar.HOUR);
		int cminute=c.get(Calendar.MINUTE);
		return new TimePickerDialog(TimePickerDialogDemo.this, timeListener, chour, cminute, false);
	}
	
	
	OnTimeSetListener timeListener=new OnTimeSetListener() {
		
		public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
			// TODO Auto-generated method stub
			et.setText(hourOfDay+":"+minute);
		}
	};
}
