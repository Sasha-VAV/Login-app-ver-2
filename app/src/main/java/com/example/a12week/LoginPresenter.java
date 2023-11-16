package com.example.a12week;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.a12week.databinding.ActivityMainBinding;

public class LoginPresenter {
    private static String TRUEPASSWORD = "1234";
    private static String TRUELOGIN = "corgi";
    public static boolean changelogin = false;
    public static String newLogin="";
    public static String newPassword="";
    private ActivityMainBinding binding;
    private Context context;
    private SharedPreferences mPref;
    public LoginPresenter(Context context, ActivityMainBinding binding,SharedPreferences mPref){
        this.binding=binding;
        this.context=context;
        this.mPref=mPref;
    }
    public boolean signInPref(){
        SecondActivity secondActivity = new SecondActivity();
        if (secondActivity.Clear){
            SharedPreferences.Editor edit = mPref.edit();
            edit.putString("LOGIN", "/././.");
            edit.putString("PASSWORD","/.//.\nmm");
            edit.commit();
            secondActivity.Clear = false;
            return false;
        }
        String loginpref = mPref.getString("LOGIN","");
        String passwordpref = mPref.getString("PASSWORD" , "");
        return loginpref.equals(TRUELOGIN) && passwordpref.equals(TRUEPASSWORD);
    }
    public boolean signIn(){

        SharedPreferences.Editor edit = mPref.edit();

        String login = binding.e1.getText().toString();
        String password = binding.e2.getText().toString();
        if (login.equals(TRUELOGIN) && password.equals(TRUEPASSWORD)){
            edit.putString("LOGIN", login);
            edit.putString("PASSWORD",password);
            edit.commit();
            return true;
        }
        return false;
    }
    public void changelogins(){
        if (changelogin) {
            TRUELOGIN = newLogin;
            TRUEPASSWORD = newPassword;
            changelogin = false;
        }
    }
}
