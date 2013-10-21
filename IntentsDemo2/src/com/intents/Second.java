package com.intents;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Second extends ListActivity {
    ArrayList list;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list=new ArrayList();
        
        
        Bundle b=getIntent().getExtras();
        list.add(b.getString("key1"));
        list.add(b.getInt("key2"));
        list.add(b.getBoolean("key3"));
        list.add(b.getFloat("key4"));
        list.add(b.getDouble("key5"));
        
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        setListAdapter(adapter);
    }  
        
}