package com.map;

import android.os.Bundle;
import android.view.KeyEvent;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

public class GoogleMapDemo1 extends MapActivity {
    MapView m;
    MapController c;
    double latitude=12.121212,longitude=76.767676;
    GeoPoint g;
   
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        m=(MapView)findViewById(R.id.myMap);
        
        m.setBuiltInZoomControls(true);
        m.displayZoomControls(true);
        
        m.setSatellite(false);
        
        c=m.getController();
        c.setZoom(4);
        
        g=new GeoPoint((int)(latitude*1000000), (int)(longitude*1000000));
        c.setCenter(g);
        
        
    }

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		
		switch (keyCode) {
		case KeyEvent.KEYCODE_S:
			m.setSatellite(true);
			return true;
			
			
		case KeyEvent.KEYCODE_M:
			m.setSatellite(false);
			return true;
			
		case KeyEvent.KEYCODE_O:
			c.setZoom(m.getZoomLevel()+1);
			return true;
			
		case KeyEvent.KEYCODE_I:
			c.setZoom(m.getZoomLevel()-1);
			return true;

		default:
			break;
		}
		
		return false;
	}
}