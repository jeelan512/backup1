package com.json;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class JSonDemo2 extends ListActivity {
    ArrayList list;
    String line;
    StringBuilder sb;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        
        list=new ArrayList();
        sb=new StringBuilder();
        
        try {
        	URL url=new URL("http://www.durgajobs.com/emp.xml");
        	InputStream is=url.openStream();
        	
        	BufferedReader reader=
        		new BufferedReader(
        				new InputStreamReader(is));
        	
        	while((line=reader.readLine())!=null){
        		sb.append(line);
        	}
        	
        	JSONObject obj1=
        		XML.toJSONObject(sb.toString());
        	
        	
        	JSONObject obj2=obj1.getJSONObject("emps");
        	
        	JSONArray array=obj2.optJSONArray("emp");
        	
        	for (int i = 0; i < array.length(); i++) {
				JSONObject obj3=array.getJSONObject(i);
				list.add(obj3.getString("eno"));
				list.add(obj3.getString("deptno"));
				list.add(obj3.getString("sal"));
				list.add(obj3.getString("name"));
        	
        	}
        	
        	
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
    }
}