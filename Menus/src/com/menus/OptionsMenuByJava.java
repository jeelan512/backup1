package com.menus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class OptionsMenuByJava extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(1, 1, 0, "Option1").setIcon(R.drawable.ic_launcher).setAlphabeticShortcut('a');
		menu.add(1, 2, 0, "Option2").setIcon(R.drawable.ic_launcher).setAlphabeticShortcut('b');
		menu.add(1, 3, 0, "Option3").setIcon(R.drawable.ic_launcher).setAlphabeticShortcut('c');
		menu.add(1, 4, 0, "Option4").setIcon(R.drawable.ic_launcher).setAlphabeticShortcut('d');
		menu.add(1, 5, 0, "Option5").setIcon(R.drawable.ic_launcher).setAlphabeticShortcut('e');
		
		
		SubMenu s1=menu.addSubMenu("sub");
		s1.add(2, 6, 1, "Sub1").setCheckable(true).setChecked(true);
		s1.add(2, 7, 1, "Sub2").setCheckable(true).setChecked(false);
		s1.add(2, 8, 1, "Sub3").setCheckable(true).setChecked(true);
		s1.add(2, 9, 1, "Sub4").setCheckable(true).setChecked(false);
		s1.add(2, 10, 1, "Sub5").setCheckable(true).setChecked(true);
		s1.add(2, 11, 1, "Sub6").setCheckable(true).setChecked(false);
		
		
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getGroupId()==1){
			Toast.makeText(getApplicationContext(), "U CLICKED GROUP 1 ITEM", 5000).show();
		}
		
		else if (item.getItemId()==2) {
			Toast.makeText(getApplicationContext(), "U CLICKED OPTION 2 ", 5000).show();
		}
		
		else if (item.getTitle()=="Sub1") {
			Toast.makeText(getApplicationContext(), "U Checked Sub1", 5000).show();
		}
		return true;
	}
	
	
    
    
}