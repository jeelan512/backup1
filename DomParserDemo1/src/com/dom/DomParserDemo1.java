package com.dom;

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

public class DomParserDemo1 extends Activity {
    String no,name,sal,dept,result="";
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        Button read=(Button)findViewById(R.id.read);
        read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
					DocumentBuilder db=dbf.newDocumentBuilder();
					Document d=db.parse(openFileInput("emp.xml"));
					
					Element e1=d.getDocumentElement();
					NodeList n11=e1.getElementsByTagName("emp");
					
					for (int i = 0; i < n11.getLength(); i++) {
						Element e2=(Element)n11.item(i);
						no=e2.getAttribute("empno");
					
						NodeList nl2=e2.getElementsByTagName("name");
						Element e3=(Element)nl2.item(0);
						Node n1=e3.getFirstChild();
						name=n1.getNodeValue();

						NodeList nl3=e2.getElementsByTagName("sal");
						Element e4=(Element)nl3.item(0);
						Node n2=e4.getFirstChild();
						sal=n2.getNodeValue();
							
						NodeList nl4=e2.getElementsByTagName("deptno");
						Element e5=(Element)nl4.item(0);
						Node n3=e5.getFirstChild();
						dept=n3.getNodeValue();


						
						result+=no+":"+name+":"+sal+":"+dept+"\n";
					}
				
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				TextView tv=(TextView)findViewById(R.id.text);
				tv.setText(result);
			}
		});
    
    
    }
}