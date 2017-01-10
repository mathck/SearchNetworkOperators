package com.gmail.mathck.searchnetworkoperators;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentSelectNetworkAutomatic = new Intent();
        intentSelectNetworkAutomatic.setAction(android.provider.Settings.ACTION_NETWORK_OPERATOR_SETTINGS);
        intentSelectNetworkAutomatic.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intentSelectNetworkAutomatic.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        intentSelectNetworkAutomatic.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);

        if (intentSelectNetworkAutomatic.resolveActivity(getPackageManager()) != null) {
            startActivity(intentSelectNetworkAutomatic);
        }
        else {
            Log.e("SearchNetworkOperators", "ACTION_NETWORK_OPERATOR_SETTINGS not found");
            Toast.makeText(this, "Selecting the network automatically did not work on your device", Toast.LENGTH_LONG).show();
        }

    }

    // http://stackoverflow.com/a/32224146/2880465
    @Override
    protected void onStart() {
        super.onStart();
        setVisible(true);
    }
}