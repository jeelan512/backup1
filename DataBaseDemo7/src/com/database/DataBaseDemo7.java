package com.database;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
class Test extends SQLiteOpenHelper{
	public Test(Context context){
		super(context, "studentdb", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
}




public class DataBaseDemo7 extends Activity {
    SQLiteDatabase db;
    Test t;
    SQLiteStatement statement;
    String sno,sname,saddress;
    Button submit;
    public static final int ALERT=1;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        t=new Test(this);
        db=t.getWritableDatabase();
        
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
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
		dialog.setTitle("Data Base Demo");
		dialog.setMessage("Do U Want To Insert The Data In Student Table");
		
		dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				EditText et1=(EditText)findViewById(R.id.sno);
				sno=et1.getText().toString();
				
				EditText et2=(EditText)findViewById(R.id.sname);
				sname=et2.getText().toString();
				
				EditText et3=(EditText)findViewById(R.id.saddress);
				saddress=et3.getText().toString();
				
				
				statement=db.compileStatement("insert into student values(?,?,?)");
				statement.bindString(1, sno);
				statement.bindString(2, sname);
				statement.bindString(3, saddress);
				statement.executeInsert();
				
				Toast.makeText(getApplicationContext(), "Data Inserted Successfully !",Toast.LENGTH_LONG).show();
			}
		});
		
		
		dialog.setNegativeButton("NO",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "Data Not Inserted",5000).show();	
			}
		});
		
		
		dialog.setNeutralButton("CANCEL",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			dialog.dismiss();	
			}
		});
		return dialog.create();
	}
}