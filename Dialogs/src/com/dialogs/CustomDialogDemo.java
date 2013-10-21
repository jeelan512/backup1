package com.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;


class Custom extends Dialog{
	public Custom(Context context){
		super(context);
		setContentView(R.layout.custom);
	}
	
	
}

public class CustomDialogDemo extends Activity {
	Custom c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		c=new Custom(this);
		c.show();
	}
}
