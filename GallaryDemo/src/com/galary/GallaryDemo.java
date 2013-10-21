package com.galary;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GallaryDemo extends Activity {
    Gallery gal;
    int[] images={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.ic_launcher};
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        gal=(Gallery)findViewById(R.id.gal);
        gal.setAdapter(new MyGalaryAdapter(getApplicationContext()));
    
    
    }
    
    
    class MyGalaryAdapter extends BaseAdapter{
    	Context context;
    	public MyGalaryAdapter(Context c){
    		context=c;
    	}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return images.length;
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
			
			ImageView iv=new ImageView(context);
			iv.setBackgroundResource(images[position]);
			
			return iv;
		}
    	
    	
    	
    }
}