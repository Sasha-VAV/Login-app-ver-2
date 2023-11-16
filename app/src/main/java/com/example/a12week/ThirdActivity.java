package com.example.a12week;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ImageView corgi = findViewById(R.id.corgi);
        //corgi.setImageDrawable(R.drawable.corgi);
        setContentView(R.layout.am3);
        Button butt = findViewById(R.id.back);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button button = findViewById(R.id.reg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1,e2;
                e1=findViewById(R.id.lg);
                e2=findViewById(R.id.ps);
                LoginPresenter.changelogin=true;
                LoginPresenter.newLogin=e1.getText().toString();
                LoginPresenter.newPassword=e2.getText().toString();
                Intent intent = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
