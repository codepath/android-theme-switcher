package com.codepath.android.themeswitcher.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;


public class ThemeActivity extends AppCompatActivity {
    private Spinner spThemes;

    // Here we set the theme for the activity
    // Note `Utils.onActivityCreateSetTheme` must be called before `setContentView`
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // MUST BE SET BEFORE setContentView
        Utils.onActivityCreateSetTheme(this);
        // AFTER SETTING THEME
        setContentView(R.layout.activity_theme);
        setupSpinnerItemSelection();
    }

    private void setupSpinnerItemSelection() {
        spThemes = (Spinner) findViewById(R.id.spThemes);
        spThemes.setSelection(ThemeApplication.currentPosition);
        ThemeApplication.currentPosition = spThemes.getSelectedItemPosition();

        spThemes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                if (ThemeApplication.currentPosition != position) {
                    Utils.changeToTheme(ThemeActivity.this, position);
                }
                ThemeApplication.currentPosition = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}