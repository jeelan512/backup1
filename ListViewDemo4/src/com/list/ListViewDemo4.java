package com.list;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewDemo4 extends Activity {
    ListView list;
    String[] names={"Dss1","Dss2","Dss3","Dss4","Dss5"};
    String[] phones={"9849098490","9849012345","9849054321","9849054678","9878978979"};
	TextView tv1,tv2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(new MyArrayAdapter(getApplicationContext()));
        
        list.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Selected Text Is..."+names[arg2]+":"+phones[arg2], 5000).show();
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
				Toast.makeText(getApplicationContext(), "Selected Text Is..."+names[arg2]+":"+phones[arg2], 5000).show();
			}
		});
        
        list.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Selected Text Is..."+names[arg2]+":"+phones[arg2], 5000).show();
				return true;
			}
		});
    }
    
    class MyArrayAdapter extends BaseAdapter{
    	Context context;
    	public MyArrayAdapter(Context c){
    		context=c;
    	}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return names.length;
		}
		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}
		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
			View v=inflater.inflate(R.layout.custom, null);
			
			tv1=(TextView)v.findViewById(R.id.text1);
			tv1.setText(names[position]);
			
			
			tv2=(TextView)v.findViewById(R.id.text2);
			tv2.setText(phones[position]);
			
			
			return v;
		}
    	
    	
    }
}