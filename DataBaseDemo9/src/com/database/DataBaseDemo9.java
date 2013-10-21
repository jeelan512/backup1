package com.database;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
class Test extends SQLiteOpenHelper{
	public Test(Context context){
		super(context, "studentdb", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
}




public class DataBaseDemo9 extends Activity {
    AutoCompleteTextView auto;
    SQLiteDatabase db;
    Test t;
	ArrayList list;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        list=new ArrayList();
        t=new Test(this);
        db=t.getWritableDatabase();
    
        Cursor c=db.rawQuery("select * from student",null);
    
        while (c.moveToNext()) {
			list.add(c.getString(1));
		}
        
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
        auto.setAdapter(adapter);
    
    }
}