package com.grid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;

public class GridViewDemo1 extends Activity {
    GridView grid;
    EditText et;
    String[] values={"Hello1","Hello2","Hello3","Hello4","Hello5","Hello6","Hello7","Hello8","Hello9"};
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        et=(EditText)findViewById(R.id.edit);
        grid=(GridView)findViewById(R.id.gr);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,values);
        grid.setAdapter(adapter);
        
        
        grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				et.setText("Selected text Is..."+values[arg2]);
			}
		});
    }
}