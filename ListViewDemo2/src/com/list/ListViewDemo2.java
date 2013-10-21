package com.list;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewDemo2 extends ListActivity {
    String[] values={"ListView1","ListView2","ListView3","ListView4","ListView5","ListView6","ListView7","ListView8","ListView9","ListView10"};
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,values);
        
        setListAdapter(adapter);
    }
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		
	Toast.makeText(getApplicationContext(), "Selected Text Is..."+values[position],5000).show();
	
	
	}
}