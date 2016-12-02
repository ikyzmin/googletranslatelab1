package com.ssau.googletranslateexample;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;

public class TranslateActivity extends AppCompatActivity {


    private AppCompatSpinner sourceSpinner;
    private AppCompatSpinner destSpinner;
    private AppCompatImageView changeLangButton;
    private String[] data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getResources().getStringArray(R.array.languages);
        setContentView(R.layout.a_translate);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        sourceSpinner = (AppCompatSpinner) findViewById(R.id.source_lang);
        destSpinner = (AppCompatSpinner) findViewById(R.id.dest_lang);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        sourceSpinner.setAdapter(adapter);
        destSpinner.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
