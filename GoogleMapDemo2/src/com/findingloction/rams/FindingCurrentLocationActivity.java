package com.findingloction.rams;


import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;


public class FindingCurrentLocationActivity extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main);
TextView display = (TextView) findViewById(R.id.mylocation);

LocationManager locationManager;
String context = Context.LOCATION_SERVICE;
locationManager = (LocationManager) getSystemService(context);


String provider = LocationManager.GPS_PROVIDER;
Location location = locationManager.getLastKnownLocation(provider);


double lat = location.getLatitude();
double lng = location.getLongitude();


String landl = "Latitude:" + lat + "\nLongitude:" + lng;


display.setText("Your current position is:\n" + landl);
}
}

