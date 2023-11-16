package com.example.a12week;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.a12week.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SharedPreferences mPref = getPreferences(MODE_PRIVATE);
        LoginPresenter presenter = new LoginPresenter(this,binding,mPref);
        if (LoginPresenter.changelogin){
            presenter.changelogins();
            LoginPresenter.changelogin=false;
        }
        if (presenter.signInPref()){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }

        //LoginPresenter presenter1
        binding.butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(presenter.signIn()){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}