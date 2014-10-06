package com.gmail.mathck.searchnetworkoperators;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Intent intent = new Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS);

        try {
            startActivity(intent);
        }
        catch (Exception e1) {
            intent.setClassName("com.android.phone", "com.android.phone.NetworkSetting");
            startActivity(intent);

            try {
                ComponentName cName = new ComponentName("com.android.phone", "com.android.phone.NetworkSetting");
                intent.setComponent(cName);
            }
            catch (Exception e2) {
            }
        }

        finish();
    }
}