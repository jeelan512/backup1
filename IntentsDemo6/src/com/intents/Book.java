package com.intents;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Book extends ListActivity {
    String[] values={"Hello1","Hello2","Hello3","Hello4","Hello5","Hello6","Hello7","Hello8","Hello9","Hello10"};
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String s=values[position];
		Intent intent=new Intent();
		intent.putExtra("key1", s);
		setResult(RESULT_OK, intent);
		finish();
	}
}