package com.ssau.googletranslateexample;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

public class TranslateActivity extends AppCompatActivity {

    private ActionBarDrawerToggle menuToggle;
    private AppCompatSpinner sourceSpinner;
    private AppCompatSpinner destSpinner;
    private AppCompatImageView changeLangButton;
    private String[] data;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        data = getResources().getStringArray(R.array.languages);
        setContentView(R.layout.a_translate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sourceSpinner = (AppCompatSpinner) findViewById(R.id.source_lang);
        destSpinner = (AppCompatSpinner) findViewById(R.id.dest_lang);
        drawer = (DrawerLayout)findViewById(R.id.drawer);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sourceSpinner.setAdapter(adapter);
        destSpinner.setAdapter(adapter);
        toolbar.setNavigationIcon(R.drawable.toggle);
        menuToggle = new ActionBarDrawerToggle(this, drawer,
                toolbar, 0, 0) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        menuToggle.syncState();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
