package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     private EditText Mobilenumber;
     private EditText Password;
     private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mobilenumber = (EditText)findViewById(R.id.etmobilenumber);
        Password = (EditText)findViewById(R.id.etpassword);
        Login = (Button)findViewById(R.id.btnLogin)
    }

    private void validate(String usermobile, String userPassword){
        if((userName == "Admin")   (userPassword == "1234")){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class)
        }
    }
}