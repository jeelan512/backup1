package com.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class First extends Activity {
    Button book;
    public static final int BOOK=1;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        book=(Button)findViewById(R.id.book);
        book.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(First.this, Book.class);
				startActivityForResult(intent, BOOK);
			}
		});
    }
	@Override
	protected void onActivityResult(int requestCode, 
			int resultCode, Intent data) {
		// TODO Auto-generated method stub
		
	if(requestCode==BOOK && resultCode==RESULT_OK){
	
		String s=data.getStringExtra("key1");
		Toast.makeText(getApplicationContext(), "Selected Text Is...."+s, 5000).show();
	}
}
}