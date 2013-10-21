package com.grid;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GridViewDemo2 extends Activity {
    GridView grid;
    ImageView iv;
    TextView tv;
    int[] images={R.drawable.india,R.drawable.brazil,R.drawable.china,R.drawable.united_states};
    String[] names={"India","Brazil","China","USA"};
    
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(new MyGridAdapter(getApplicationContext()));
        
        grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"Text Of Grid View Is..."+names[arg2],Toast.LENGTH_SHORT).show();
			}
		});
    
    
    
    
    }
    
    
    
    class MyGridAdapter extends BaseAdapter{
    	Context context;
    	public MyGridAdapter(Context c){
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
			
			
			iv=(ImageView)v.findViewById(R.id.iv);
			iv.setBackgroundResource(images[position]);
			
			tv=(TextView)v.findViewById(R.id.text);
			tv.setText(names[position]);
			
			return v;
		}
    	
    	
    	
    }
}