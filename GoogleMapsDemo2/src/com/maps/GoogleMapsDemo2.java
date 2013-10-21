package com.maps;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class GoogleMapsDemo2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.121212,76.767676"));
        startActivity(intent);
    }
}