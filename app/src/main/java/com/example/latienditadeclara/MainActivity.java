package com.example.latienditadeclara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private CallbackManager callbackManager;
    private LoginButton loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = findViewById(R.id.login_button);

        callbackManager = CallbackManager.Factory.create();

        loginbutton.setPermissions(Arrays.asList("email, user_gender, user_friends, user_posts, user_messenger_contact, public_profile, user_photos0, user_videos"));

        loginbutton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.d("Demo", "Login Succesfull");
            }

            @Override
            public void onCancel() {
                Log.d("Demo", "Login Cancel");

            }

            @Override
            public void onError(FacebookException error) {
                Log.d("Demo", "Login Failed");

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
}