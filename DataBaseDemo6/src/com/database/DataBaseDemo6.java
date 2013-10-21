package com.database;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

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



public class DataBaseDemo6 extends Activity {
    SQLiteDatabase db;
    Test t;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        t=new Test(this);
        db=t.getWritableDatabase();
        
        ContentValues values1=new ContentValues();
        values1.put("sno",111);
        values1.put("name", "DSS1");
        values1.put("address", "SRNAGAR 1");
        db.insert("student", null, values1);
       
        
        ContentValues values2=new ContentValues();
        values2.put("sno",222);
        values2.put("name", "DSS2");
        values2.put("address", "SRNAGAR 2");
        db.insert("student", null, values2);
        
        
        TextView tv=new TextView(this);
        tv.setText("Data Inserted Successfully");
        tv.setTextColor(Color.RED);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
       
        
        
        
        
        
        
        
        setContentView(tv);
    }
}