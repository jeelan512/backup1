package com.sax;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaxDemo2 extends Activity {
    Button bt;
    EditText et;
    TextView tv;
    //boolean flag=false;
    String eno;
    String result="";
    Test t;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        et=(EditText)findViewById(R.id.edit);
        eno=et.getText().toString();
        tv=(TextView)findViewById(R.id.text);
        t=new Test();
        t._eno=eno;
        bt=(Button)findViewById(R.id.bt);
        
        try {
			//URL url=new URL("http://www.durgajobs.com/emp.xml");
			InputStream is=getAssets().open("emp.xml");
			
			SAXParserFactory spf=SAXParserFactory.newInstance();
			SAXParser sp=spf.newSAXParser();
			sp.parse(is, new Test());
			
			bt.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					if(t.flag){
						result+="Employee Found";
					}
					else {
						result+="Employee Not Found";
					}
				}
			});
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		tv.setText(result);
    }
    
    class Test extends DefaultHandler{
    	public String _eno;
    	boolean emp=false;
    	boolean flag=false;

		@Override
		public void startElement(String uri, 
				String localName, 
				String qName,
				Attributes attributes) throws SAXException {
			// TODO Auto-generated method stub
			if(localName.equals("emp")){
				String attr=attributes.getValue("eno");
				
				if(_eno.equals(attr)){
					flag=true;
				}
			}
		}
    	
    	
    }
}