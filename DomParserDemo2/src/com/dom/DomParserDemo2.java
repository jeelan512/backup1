package com.dom;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DomParserDemo2 extends Activity {
    String s1,s2,s3,eno="",ename="",desg="",result="";
    Button read;
    TextView tv;
    URL url;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        read=(Button)findViewById(R.id.read);
        read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					
					url=new URL("http://www.durgajobs.com/employeedetails.xml");
					InputStream is=url.openStream();
					
					DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
					DocumentBuilder db=dbf.newDocumentBuilder();
					
					Document d=db.parse(is);
					
					Element e1=d.getDocumentElement();
					NodeList nl1=e1.getElementsByTagName("eno");
					
					for (int i = 0; i < nl1.getLength(); i++) {
						Element e2=(Element)nl1.item(i);
						Node n1=e2.getFirstChild();
						s1=n1.getNodeValue();
						
						eno+=s1+"\n";
						
					}
					
					NodeList nl2=e1.getElementsByTagName("ename");
					
					for (int i = 0; i < nl2.getLength(); i++) {
						Element e3=(Element)nl2.item(i);
						Node n2=e3.getFirstChild();
						s2=n2.getNodeValue();
						
						ename+=s2+"\n";
						
					}
					
					result+=eno+ename+"\n";
					
					tv=(TextView)findViewById(R.id.text);
					tv.setText(result);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
    
    }
}