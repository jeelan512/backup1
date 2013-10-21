package com.database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DataBaseDemo2 extends Activity {
    String line;
    StringBuffer sb;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        sb=new StringBuffer();
        
        try {
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(openFileOutput("myfile",MODE_WORLD_WRITEABLE)));
			writer.write("Android1"+"\n");
			writer.write("Android2"+"\n");
			writer.write("Android3"+"\n");
			writer.write("Android4"+"\n");
			writer.write("Android5"+"\n");
			writer.close();
			
			
			BufferedReader reader=new BufferedReader(new InputStreamReader(openFileInput("myfile")));
			while ((line=reader.readLine())!=null) {
				sb.append(line+"\n");
			}
			
			TextView tv=(TextView)findViewById(R.id.text);
			tv.setText(sb.toString());
        } catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}