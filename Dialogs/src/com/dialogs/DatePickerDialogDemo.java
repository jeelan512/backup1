package com.dialogs;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class DatePickerDialogDemo extends Activity {
	public static final int DATE=1;
	Button bt;
	EditText et;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.date);
		
		et=(EditText)findViewById(R.id.edit);
		bt=(Button)findViewById(R.id.bt);
		
		bt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(DATE);
			}
		});
		
		
	}
	
	
	@Override
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		int cyear=c.get(Calendar.YEAR);
		int cmonth=c.get(Calendar.MONTH);
		int cday=c.get(Calendar.DAY_OF_MONTH);
		return new DatePickerDialog(DatePickerDialogDemo.this, dateListener, cyear, cmonth, cday);
	}
	
	
	OnDateSetListener dateListener=new OnDateSetListener() {
		
		public void onDateSet(DatePicker view, 
				int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			et.setText(year+"/"+monthOfYear+"/"+dayOfMonth);
		}
	};
}
