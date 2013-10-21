package com.json;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class JSonDemo1 extends ListActivity {
    String line;
    StringBuilder sb;
    ArrayList list;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        list=new ArrayList();
        sb=new StringBuilder();
        
        try {
        	
        	InputStream is=getAssets().open("emp.json");
			
        	BufferedReader reader=
				new BufferedReader(
						new InputStreamReader(is));
        	
        	while((line=reader.readLine())!=null){
        		sb.append(line);
        	}
        	
        	
        	JSONObject obj=new JSONObject(sb.toString());
        	JSONArray array=obj.optJSONArray("employees");
        	
        	
        	for (int i = 0; i < array.length(); i++) {
				JSONObject obj2=array.getJSONObject(i);
				list.add(obj2.getString("key1"));
				list.add(obj2.getString("key2"));
				
        	}
        	
        	
        	
        	
        	
        
        } catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
        
        setListAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1, list));
        
        
    }
}