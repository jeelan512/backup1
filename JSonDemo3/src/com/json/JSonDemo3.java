package com.json;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class JSonDemo3 extends ListActivity {
    String line;
    StringBuilder sb;
    TextView tv;
    ArrayList list;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        sb=new StringBuilder();
        list=new ArrayList();
        
        tv=(TextView)findViewById(R.id.text);
        
        
        try {
			InputStream is=getAssets().open("student.json");
			BufferedReader reader=
				new BufferedReader(
						new InputStreamReader(is));
			
			while((line=reader.readLine())!=null){
				sb.append(line);
			}
			
			JSONObject obj=new JSONObject(sb.toString());
			String xml=XML.toString(obj);
			
			
			 InputSource os = new InputSource();
			 os.setCharacterStream(
					 new StringReader(xml));
			 
			 /*
			 //Dom Parser Code
		    DocumentBuilderFactory dbf=
				 DocumentBuilderFactory.newInstance();
			
			DocumentBuilder db=dbf.newDocumentBuilder();
			
			Document d=db.parse(os);
			
			
			list.add(
					d.getDocumentElement().
					getElementsByTagName("id").
					item(0).
					getFirstChild().
					getNodeValue());
			
			list.add(
					d.getDocumentElement().
					getElementsByTagName("class").
					item(0).
					getFirstChild().
					getNodeValue());
			 
			list.add(
					d.getDocumentElement().
					getElementsByTagName("name").
					item(0).
					getFirstChild().
					getNodeValue());
			*/
			 
			
			 
			 
			 /*
			 //Sax Parser Demo
			 SAXParserFactory spf=
				 SAXParserFactory.newInstance();
			 
			 SAXParser sp=spf.newSAXParser();
			 
			 sp.parse(os, new Test());
			 
			 */
			 
			 
			 //xml pull parser
			 XmlPullParserFactory xpf=
				 XmlPullParserFactory.newInstance();
			 
			 XmlPullParser xp=xpf.newPullParser();
			 
			 xp.setInput(new StringReader(xml));
			 
			 int eventType=xp.getEventType();
			 
			 while(eventType!=XmlPullParser.END_DOCUMENT) {
				if(eventType==XmlPullParser.TEXT){
					list.add(xp.getText());
				}
				
				eventType=xp.next();
			}
			 
        } catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		setListAdapter(new ArrayAdapter(this,
				android.R.layout.simple_list_item_1,
				list));
    }
    
    
    /*class Test extends DefaultHandler{
    	public boolean id=false;
    	public boolean Class=false;
    	public boolean name=false;
		@Override
		public void characters(char[] ch, 
				int start, int length)
				throws SAXException {
			// TODO Auto-generated method stub
			if(this.id){
				list.add(new String(ch,start,length));
			}
			
			else if (this.Class) {
				list.add(new String(ch,start,length));
			}
			
			else if (this.name) {
				list.add(new String(ch,start,length));
			}
		}
		@Override
		public void endDocument() throws SAXException {
			// TODO Auto-generated method stub
			System.out.println("--End Document--");
		}
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			// TODO Auto-generated method stub
			if(localName.equals("id")){
				this.id=false;
			}
			
			else if (localName.equals("class")) {
				this.Class=false;
			}
			
			else if (localName.equals("name")) {
				this.name=false;
			}

		}
		@Override
		public void startDocument() throws SAXException {
			// TODO Auto-generated method stub
			System.out.println("---Start Document---");
		}
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			// TODO Auto-generated method stub
			if(localName.equals("id")){
				this.id=true;
			}
			
			else if (localName.equals("class")) {
				this.Class=true;
			}
			
			else if (localName.equals("name")) {
				this.name=true;
			}
		
		}
    	
    }*/
    
}