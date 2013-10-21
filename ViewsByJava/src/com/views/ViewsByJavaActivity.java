package com.views;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ViewsByJavaActivity extends Activity {
    LinearLayout layout;
    TextView tv;
    EditText et;
    Button bt;
    CheckBox c;
    RadioButton r;
    ToggleButton tb;
    RatingBar rb;
    ImageView iv;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        layout=new LinearLayout(this);
        layout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
        layout.setOrientation(LinearLayout.VERTICAL);
        
        tv=new TextView(this);
        tv.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
        tv.setText("Welcome");
        tv.setTextColor(Color.RED);
        tv.setTextSize(20);
        tv.setGravity(Gravity.CENTER);
        layout.addView(tv);
        
        
        et=new EditText(this);
        et.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
        et.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        layout.addView(et);
        
        
        bt=new Button(this);
        bt.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
        bt.setText("Button");
        bt.setTextColor(Color.BLUE);
        bt.setTextSize(20);
        bt.setGravity(Gravity.CENTER);
        layout.addView(bt);
        
        
        c=new CheckBox(this);
        c.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
        c.setText("SSC");
        c.setTextColor(Color.GREEN);
        c.setTextSize(20);
        c.setGravity(Gravity.CENTER);
        layout.addView(c);
        
        
        r=new RadioButton(this);
        r.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
        r.setText("Male");
        r.setTextColor(Color.GREEN);
        r.setChecked(true);
        r.setTextSize(20);
        r.setGravity(Gravity.LEFT);
        layout.addView(r);
        
        
        tb=new ToggleButton(this);
        tb.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        tb.setTextOn("Encrypted");
        tb.setTextOff("Decrypted");
        tb.setChecked(true);
        layout.addView(tb);
        
        rb=new RatingBar(this);
        rb.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        rb.setNumStars(5);
        rb.setRating(1);
        rb.setStepSize(1);
        layout.addView(rb);
        
        
        
        
        setContentView(layout);
    }
}