package com.example.a12week;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a12week.databinding.ActivityMainBinding;

import java.io.FileInputStream;
import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private SharedPreferences mPref;
    public static boolean Clear=false;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ImageView corgi = findViewById(R.id.corgi);
        //corgi.setImageDrawable(R.drawable.corgi);
        setContentView(R.layout.am2);
        Button butt = findViewById(R.id.back);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear = true;
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
