package com.daatabase;


import java.util.ArrayList;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class DataBaseDemo3 extends ListActivity {
    ArrayList list;
    SQLiteDatabase db;
   
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        list=new ArrayList();
        
    
        
        try {
			db=openOrCreateDatabase("empdb", MODE_WORLD_WRITEABLE, null);
		
			//create the taable
			db.execSQL("create table emp(eno number(10),ename varchar2(20),esal number(10))");
			
			//insert the data
			db.execSQL("insert into emp values(101,'dss1',5000)");
			db.execSQL("insert into emp values(102,'dss2',6000)");
			db.execSQL("insert into emp values(103,'dss3',7000)");
			db.execSQL("insert into emp values(104,'dss4',8000)");
			db.execSQL("insert into emp values(105,'dss5',9000)");
			db.execSQL("insert into emp values(106,'dss6',10000)");
			
			//update the data
			db.execSQL("update emp set esal=esal+500 where esal<10000");
			
			//delete the data
			db.execSQL("delete from emp where esal=10000");
			
			//retive the data
            Cursor c=db.rawQuery("select * from emp", null);
			while (c.moveToNext()) {
				list.add(c.getInt(0)+":"+c.getString(1)+":"+c.getInt(2));
				
			}
			
		setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
        
        } catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}