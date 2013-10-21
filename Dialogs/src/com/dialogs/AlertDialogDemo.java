package com.dialogs;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogDemo extends Activity {
    Button bt;
    public static final int ALERT=1;
    String[] colors={"RED","GREEN","YELLOW","PINK","WHITE","BLACK"};
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert);
        
        
        bt=(Button)findViewById(R.id.alert);
        bt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(ALERT);
			}
		});
    }
    
    
    @Override
    protected Dialog onCreateDialog(int id) {
    	// TODO Auto-generated method stub
    	Builder dialog=new Builder(this);
    	dialog.setIcon(R.drawable.ic_launcher);
    	dialog.setTitle("choose color");
    	/*dialog.setMessage("Do U Want To Insert the data in emp table?");
    	dialog.setPositiveButton("YES",new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Data Inserted Successfully !", 5000).show();
			}
		});
    	
    	
    	dialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Data Not Inserted Successfully !", 5000).show();
			}
		});
    	
    	
    	dialog.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.cancel();
			}
		});
    	
    	
    	
    	dialog.setItems(colors, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "selected Color Is...."+colors[which],5000).show();	
			}
		});*/
    	
    	
    	
    	dialog.setSingleChoiceItems(colors, -1, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "selected Color Is...."+colors[which],5000).show();
			}
		});
    	
    	
    	
    	
    	return dialog.create();
    }
}