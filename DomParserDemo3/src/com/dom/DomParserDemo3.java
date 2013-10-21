package com.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DomParserDemo3 extends Activity {
    Button submit;
    String empno,ename,esal,deptno;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				try {
					
					EditText et1=(EditText)findViewById(R.id.empno);
					empno=et1.getText().toString();
					
					EditText et2=(EditText)findViewById(R.id.ename);
					ename=et2.getText().toString();

					EditText et3=(EditText)findViewById(R.id.esal);
					esal=et3.getText().toString();

					EditText et4=(EditText)findViewById(R.id.deptno);
					deptno=et4.getText().toString();

					
					DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
					DocumentBuilder db=dbf.newDocumentBuilder();
					Document d=db.parse(openFileInput("emp.xml"));
					
					
					//creating the elements in Dom Tree Structure
					Element e1=d.createElement("emp");
					Element e2=d.createElement("name");
					Element e3=d.createElement("sal");
					Element e4=d.createElement("deptno");
					
					//create the TextNodes In Dom Tree Structure
					Node n1=d.createTextNode(ename);
					Node n2=d.createTextNode(esal);
					Node n3=d.createTextNode(deptno);
					
					//append the nodes to the elements
					e2.appendChild(n1);
					e3.appendChild(n2);
					e4.appendChild(n3);
					
					//append the elements to the Emp Element
					e1.appendChild(e2);
					e1.appendChild(e3);
					e1.appendChild(e4);
					e1.setAttribute("empno", empno);
					
					//add the complete Element to The Root Element
					d.getDocumentElement().appendChild(e1);
					
					
					//Append The Data to The emp.xml
					
					TransformerFactory tsf=TransformerFactory.newInstance();
					Transformer tf=tsf.newTransformer();
					DOMSource ds=new DOMSource(d);
					StreamResult rs=new StreamResult(openFileOutput("emp.xml",MODE_WORLD_WRITEABLE));
					tf.transform(ds, rs);
					
					Toast.makeText(getApplicationContext(), "Data Saved Successfully !",Toast.LENGTH_LONG).show();
					
									
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
							
			}
		});
    }
}