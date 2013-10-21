package com.database;

import java.util.ArrayList;
import android.app.ListActivity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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
public class DataBaseDemo8 extends ListActivity {
    SQLiteDatabase db;
    ArrayList list;
	Test t;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list=new ArrayList();
        t=new Test(this);
        db=t.getWritableDatabase();
        
        Cursor c=db.rawQuery("select * from student",null);
        while (c.moveToNext()) {
			list.add(c.getInt(0)+":"+c.getString(1)+":"+c.getString(2));
			
		}
        
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,list));
        
        
    }
}