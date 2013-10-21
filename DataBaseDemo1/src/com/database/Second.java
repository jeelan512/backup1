package com.database;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class Second extends ListActivity {
    ArrayList list;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         list=new ArrayList();
         
         SharedPreferences shared=getSharedPreferences("shared", MODE_WORLD_READABLE);
         list.add(shared.getString("key1", "Nothing1"));
         list.add(shared.getInt("key2", 0));
         list.add(shared.getBoolean("key3", false));
         list.add(shared.getFloat("key4", 0));
         list.add(shared.getLong("key5", 0));
         list.add(shared.getString("key6", "NOTHING"));
         
         setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
         
    
    
    }
}