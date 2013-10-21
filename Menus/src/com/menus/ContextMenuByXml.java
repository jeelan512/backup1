package com.menus;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextMenuByXml extends Activity {
    Button bt;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        bt=(Button)findViewById(R.id.bt);
        registerForContextMenu(bt);
    
    }

	@Override
	public void onCreateContextMenu(ContextMenu menu,View view,ContextMenuInfo info) {
		// TODO Auto-generated method stub
		MenuInflater inflater=new MenuInflater(this);
		inflater.inflate(R.menu.context, menu);
		
		
			}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==R.id.context1){
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 1",5000).show();
		}
		
		else if (item.getItemId()==R.id.context2) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 2",5000).show();
		}
		
		else if (item.getItemId()==R.id.context3) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 3",5000).show();
		}
		
		else if (item.getItemId()==R.id.context4) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 4",5000).show();
		}
		
		else if (item.getItemId()==R.id.context5) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 5",5000).show();
		}
		
		else if (item.getItemId()==R.id.context6) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 6",5000).show();
		}
		
		
		return true;
	}	
	
}