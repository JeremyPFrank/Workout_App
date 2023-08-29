package com.example.ultimateproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {



    TextView username;
    TextView password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginbtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Welcome " + username.getText().toString() + "!\n" + password.getText().toString() + "!\nYou can do it!" , Toast.LENGTH_SHORT).show();

                    openActivity2();
                //} else {
                    //Toast.makeText(MainActivity.this, "Incorrect Username/Password!", Toast.LENGTH_SHORT).show();

               // }
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Workouts_Home.class);
        startActivity(intent);
        }


}