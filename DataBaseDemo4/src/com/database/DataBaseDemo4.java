package com.database;

import java.util.ArrayList;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class DataBaseDemo4 extends Activity {
    AutoCompleteTextView auto;
    ArrayList list;
    SQLiteDatabase db;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        list=new ArrayList();
        
        
        try {
			db=openOrCreateDatabase("empdb", MODE_WORLD_READABLE, null);
			Cursor c=db.rawQuery("select * from emp",null);
			while (c.moveToNext()) {
				list.add(c.getString(1));
				
			}
			
			ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
			
			auto.setAdapter(adapter);
        
        
        
        
        } catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    
    
    }
}