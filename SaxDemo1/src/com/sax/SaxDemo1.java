package com.sax;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class SaxDemo1 extends ListActivity {
    ArrayList list;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list=new ArrayList();
        
        
        try {
			SAXParserFactory spf=
				SAXParserFactory.newInstance();
			
			SAXParser sp=spf.newSAXParser();
			
			/*
			//reading the xml file from directory structure
			sp.parse(new File("/data/data/com.sax/files/student.xml"),new Test());
			
			
			//reading the data from assets folder
			InputStream is=getAssets().open("student.xml");
			sp.parse(is,new Test());
			
			//reading the data from raw folder
			InputStream is=getResources().
			openRawResource(R.raw.student);
			sp.parse(is, new Test());
			
			//reading the data from sdcard
			sp.parse(new File("/sdcard/student.xml"),new Test());
			
			//reading the data from tomacat server
			URL url=new URL("http://192.168.128.8:8888/student.xml");
			InputStream is=url.openStream();
			sp.parse(is, new Test());
			
			//reading the data by using InputSource Object
			URL url=new URL("http://192.168.128.8:8888/student.xml");
			InputStream is=url.openStream();
			sp.parse(new InputSource(is), new Test());*/
			
			
			//reading the data by using XMlReader
			XMLReader reader=sp.getXMLReader();
			reader.setContentHandler(new Test());
			URL url=new URL("http://192.168.128.8:8888/student.xml");
			InputStream is=url.openStream();
			reader.parse(new InputSource(is));
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, list));
    }
    
    
    class  Test extends DefaultHandler{
    	public boolean student=false;
    	public boolean id=false;
    	public boolean name=false;
    	public boolean phone=false;
    	public boolean course=false;
    	public boolean email=false;
		@Override
		public void startDocument() throws SAXException {
			// TODO Auto-generated method stub
			System.out.println("--Starting Of The Document--");
		}
		@Override
		public void startElement(String uri, 
				String localName, 
				String qName,
				Attributes attributes) throws SAXException {
			// TODO Auto-generated method stub
			if(localName.equals("student")){
				this.student=true;
			}
			
			
			else if (localName.equals("id")) {
				this.id=true;
			}
			
			else if (localName.equals("name")) {
				this.name=true;
			}
			
			else if (localName.equals("phone")) {
				this.phone=true;
			}
			
			else if (localName.equals("course")) {
				this.course=true;
			}
			
			else if (localName.equals("email")) {
				this.email=true;
			}
		}
		@Override
		public void characters(char[] ch, int start, int length)
				throws SAXException {
			// TODO Auto-generated method stub
			if(this.id){
				list.add(new String(ch,start,length));
			}
			
			else if (this.name) {
				list.add(new String(ch,start,length));
			}
			
			else if (this.phone) {
				list.add(new String(ch,start,length));
			}
			
			else if (this.course) {
				list.add(new String(ch,start,length));
			}
			
			else if (this.email) {
				list.add(new String(ch,start,length));
			}
			
			
			
		}
		@Override
		public void endDocument() throws SAXException {
			// TODO Auto-generated method stub
			super.endDocument();
		}
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			// TODO Auto-generated method stub
			
			if(localName.equals("student")){
				this.student=false;
			}
			
			
			else if (localName.equals("id")) {
				this.id=false;
			}
			
			else if (localName.equals("name")) {
				this.name=false;
			}
			
			else if (localName.equals("phone")) {
				this.phone=false;
			}
			
			else if (localName.equals("course")) {
				this.course=false;
			}
			
			else if (localName.equals("email")) {
				this.email=false;
			}
		
		
		
		
		
		
		
		}
		
		
    	
    	
    	
    }
}