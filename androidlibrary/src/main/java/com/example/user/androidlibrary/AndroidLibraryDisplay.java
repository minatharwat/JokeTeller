package com.example.user.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibraryDisplay extends AppCompatActivity {
TextView textView;
    String joke_str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library_display);

        textView=(TextView)findViewById(R.id.joke_d);
        joke_str=getIntent().getStringExtra("joke");
        textView.setText(joke_str);

    }
}
