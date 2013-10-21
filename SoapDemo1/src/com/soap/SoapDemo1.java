package com.soap;

import android.app.Activity;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class SoapDemo1 extends Activity {
	private final String NAMESPACE = "http://tempuri.org/";
    private final String URL = "http://www.w3schools.com/webservices/tempconvert.asmx";
    private final String SOAP_ACTION = "http://tempuri.org/CelsiusToFahrenheit";
    private final String METHOD_NAME = "CelsiusToFahrenheit";
    Button b;
    TextView tv;
    EditText et;

    public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.main);

                et = (EditText) findViewById(R.id.edit);
                tv = (TextView) findViewById(R.id.tv_result);
                b = (Button) findViewById(R.id.button1);
                b.setOnClickListener(new OnClickListener() {
                            public void onClick(View v) {
                               
                            	
                            	//request part
                            	SoapObject request = 
                            		new SoapObject
                            		("http://tempuri.org/", 
                            			"FahrenheitToCelsius");

                            	//set the value to the request
                            	PropertyInfo celsiusPI = new PropertyInfo();
                                celsiusPI.setName("Fahrenheit");
                                celsiusPI.setValue(et.getText().toString());
                                celsiusPI.setType(double.class);
                                request.addProperty(celsiusPI);

                                //envelop creation
                                SoapSerializationEnvelope envelope = 
                                	new SoapSerializationEnvelope(
                                                     SoapEnvelope.VER11);
                                envelope.dotNet = true;
                                envelope.setOutputSoapObject(request);
                                
                                //networking b/w android and service
                                HttpTransportSE 
                                androidHttpTransport = 
                                new HttpTransportSE(
                  "http://www.w3schools.com/webservices/tempconvert.asmx");

                                try {
                                	//calling the method
                                	transoprt.
call("http://tempuri.org/FahrenheitToCelsius"
, 
                                			envelope);
                                	
                                	//creating the response
  SoapPrimitive response = (SoapPrimitive)
                                	envelope.getResponse();
                                	tv.setText(response.toString()+"° F");

                                } catch (Exception e) {
                                            e.printStackTrace();
                                }
                          }
                });
    }
}