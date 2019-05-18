package com.example.beatfindr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button artist_login_button = (Button) findViewById(R.id.artist_button);
        Button user_login_button = (Button) findViewById(R.id.user_button);

        artist_login_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(StartActivity.this, ArtistLoginActivity.class);
                StartActivity.this.startActivity(myIntent);
            }
        });

        user_login_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(StartActivity.this, UserLoginActivity.class);
                StartActivity.this.startActivity(myIntent);
            }
        });
    }

}
