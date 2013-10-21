package com.list;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewDemo1 extends Activity {
    ListView list;
    String[] values={"9849012345","ListView2","ListView3","ListView4","ListView5","ListView6","ListView7","ListView8","ListView9","ListView10"};
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        list=(ListView)findViewById(R.id.list);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,values);
        list.setAdapter(adapter);
        
        
        
        list.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Selected Text Is..."+values[arg2],5000).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				String no=values[arg2];
				Toast.makeText(getApplicationContext(), "Text of list View..."+no, 5000).show();
				Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+no));
				startActivity(intent);
			}
		});
        
        list.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				String no=values[arg2];
				Toast.makeText(getApplicationContext(), "Text of list View..."+no, 5000).show();
				
				
				
				return true;
			}
		});
    
    }
}