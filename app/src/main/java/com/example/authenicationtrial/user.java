package com.example.authenicationtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class user extends AppCompatActivity {
    TextView btnLogOut;
    TextView Oppo;
    FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        btnLogOut = (TextView) findViewById(R.id.btnlogout);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();

                Intent I = new Intent(user.this, login.class);
                startActivity(I);

            }
        });

        Oppo = (TextView) findViewById(R.id.oppo);
        Oppo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();

                Intent I = new Intent(user.this, Opportunities.class);
                startActivity(I);

            }
        });
    }
}