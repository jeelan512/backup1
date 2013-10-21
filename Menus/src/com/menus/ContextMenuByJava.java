package com.menus;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextMenuByJava extends Activity {
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
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		menu.add(1, 1, 0, "Context1");
		menu.add(1, 2, 0, "Context2");
		menu.add(1, 3, 0, "Context3");
		menu.add(1, 4, 0, "Context4");
		menu.add(1, 5, 0, "Context5");
		menu.add(1, 6, 0, "Context6");
		
		SubMenu s1=menu.addSubMenu("sub1");
		s1.add(2, 7, 1, "Sub1").setCheckable(true).setChecked(true);
		s1.add(2, 8, 1, "Sub2").setCheckable(true).setChecked(true);
		s1.add(2, 9, 1, "Sub3").setCheckable(true).setChecked(false);
		s1.add(2, 10, 1, "Sub4").setCheckable(true).setChecked(true);
		s1.add(2, 11, 1, "Sub5").setCheckable(true).setChecked(false);
		s1.add(2, 12, 1, "Sub6").setCheckable(true).setChecked(true);
	
	
	}
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getGroupId()==1){
			Toast.makeText(getApplicationContext(), "U CLICKED GROUP 1 ITEM",5000).show();
		}
		
		if(item.getItemId()==2){
			Toast.makeText(getApplicationContext(), "U CLICKED CONTEXT 2",Toast.LENGTH_SHORT).show();
		}
		
		if(item.getTitle()=="Sub1"){
			Toast.makeText(getApplicationContext(), "U CLICKED SUB 1",10000).show();
		}
		
		
		
		return true;
	}
    
    

}