package com.stylingandroid.packagename;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView packageNameTextView = (TextView) findViewById(R.id.package_name);
        TextView applicationIdTextView = (TextView) findViewById(R.id.application_id);

        packageNameTextView.setText(getString(R.string.package_name, BuildConfig.class.getPackage().toString()));
        applicationIdTextView.setText(getString(R.string.application_id, BuildConfig.APPLICATION_ID));
    }
}
