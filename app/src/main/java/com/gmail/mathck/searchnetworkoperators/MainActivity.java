package com.gmail.mathck.searchnetworkoperators;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Intent intent = new Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS);
        startActivity(intent);
        finish();
    }
}