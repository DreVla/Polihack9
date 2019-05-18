package com.example.beatfindr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class UserLoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        ImageView facebook_login = (ImageView) findViewById(R.id.user_facebook_login);
        ImageView instagram_login = (ImageView) findViewById(R.id.user_instagram_login);

        facebook_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(UserLoginActivity.this, MainActivity.class);
                UserLoginActivity.this.startActivity(myIntent);
            }
        });

        instagram_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(UserLoginActivity.this, MainActivity.class);
                UserLoginActivity.this.startActivity(myIntent);
            }
        });
    }
}
