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
        intent.setClassName("com.android.phone", "com.android.phone.NetworkSetting");

        try {
            startActivity(intent);
        }
        catch (Exception e1) {
            intent = new Intent(Intent.ACTION_MAIN);
            intent.setClassName("com.android.phone", "com.android.phone.NetworkSetting");

            try {
                startActivity(intent);
            }
            catch (Exception e2) {
                intent = new Intent(Intent.ACTION_MAIN);
                ComponentName cName = new ComponentName("com.android.phone", "com.android.phone.NetworkSetting");
                intent.setComponent(cName);

                try {
                    startActivity(intent);
                }
                catch (Exception e3) {
                    intent = new Intent(Intent.ACTION_MAIN);
                    ComponentName cName2 = new ComponentName("com.android.phone", "com.android.phone.MobileNetworkSettings");
                    intent.setComponent(cName2);

                    startActivity(intent);
                }
            }
        }

        //finish(); don't close the app
    }
}