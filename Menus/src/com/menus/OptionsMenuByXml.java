package com.menus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class OptionsMenuByXml extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater=new MenuInflater(this);
		inflater.inflate(R.menu.option, menu);
		
		
		
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==R.id.option1){
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 1",5000).show();
		}
		
		else if (item.getItemId()==R.id.option2) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 2",5000).show();
		}
		
		else if (item.getItemId()==R.id.option3) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 3",5000).show();
		}
		
		else if (item.getItemId()==R.id.option4) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 4",5000).show();
		}
		
		else if (item.getItemId()==R.id.option5) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 5",5000).show();
		}
		
		else if (item.getItemId()==R.id.option6) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 6",5000).show();
		}
		
		
		
		return true;
	}	
	
	
    
    
}