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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewDemo6 extends Activity {
    ListView list;
    TextView tv1,tv2,tv3;
    ImageView iv1,iv2;
    String[] names={"Dss1"};
    String[] phones={"12345"};
    String[] emails={"Dss1@gmail.com"};
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
				Toast.makeText(getApplicationContext(),"Selected Text Is..."+names[arg2]+"\n"+phones[arg2]+"\n"+emails[arg2],Toast.LENGTH_LONG).show();
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
				Toast.makeText(getApplicationContext(),"Selected Text Is..."+names[arg2]+"\n"+phones[arg2]+"\n"+emails[arg2],Toast.LENGTH_LONG).show();
			}
		});
        
        
        list.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"Selected Text Is..."+names[arg2]+"\n"+phones[arg2]+"\n"+emails[arg2],Toast.LENGTH_LONG).show();
				
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
			return 1;
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
			
			iv1=(ImageView)v.findViewById(R.id.iv1);
			iv1.setBackgroundResource(R.drawable.ic_launcher);
			
			tv1=(TextView)v.findViewById(R.id.name);
			tv1.setText(names[position]);
			
			tv2=(TextView)v.findViewById(R.id.phone);
			tv2.setText(phones[position]);
			
			tv3=(TextView)v.findViewById(R.id.email);
			tv3.setText(emails[position]);
			
			iv2=(ImageView)v.findViewById(R.id.iv2);
			iv2.setBackgroundResource(R.drawable.ic_launcher);
			
			
			
			
			
			
			
			return v;
		}
    	
    	
    }
}