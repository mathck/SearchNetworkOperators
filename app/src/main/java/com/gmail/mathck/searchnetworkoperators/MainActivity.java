package com.gmail.mathck.searchnetworkoperators;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

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
            intent = new Intent();
            intent.setClassName("com.android.phone", "com.android.phone.NetworkSetting");

            try {
                startActivity(intent);
            }
            catch (Exception e2) {
                intent = new Intent();
                ComponentName cName = new ComponentName("com.android.phone", "com.android.phone.NetworkSetting");
                intent.setComponent(cName);

                startActivity(intent);
            }
        }

        finish();
    }
}