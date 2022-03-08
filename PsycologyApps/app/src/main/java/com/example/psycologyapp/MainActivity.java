package com.example.psycologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    EditText password;
    Button logIn;
    TextView signUp;
    Administrator a1, a2;
    Member m1;
    LinkedList<Administrator> adInfo = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = new Administrator( "Benjamin", "1234");
        a2 = new Administrator( "Alita", "4567");
        m1 = new Member("Kyle", "6502323", "sdsds@gmail.com", "Mountain View, sds");

        adInfo.add(a1);
        adInfo.add(a2);
        name = findViewById(R.id.userName);
        password = findViewById(R.id.userPassword);
        logIn = findViewById(R.id.LogIn);
        signUp = findViewById(R.id.signUpMessage);
        logIn.setOnClickListener(this);
        signUp.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.LogIn:
                    if (isMatch())
                        goToDriverMode();
                    else
                        Toast.makeText(MainActivity.this, "Wrong name or password!!", Toast.LENGTH_LONG).show();
                    break;

            case R.id.signUpMessage:
                goToSignUp();
                break;
        }

    }


    private boolean isMatch(){

        boolean flag = true;
        for(int i = 0; i < adInfo.size(); i++) {
            if (adInfo.get(i).getName().equals(name.getText().toString().trim()) && adInfo.get(i).getUserPassword().equals(password.getText().toString().trim()))
                return true;
            else
                flag = false;
        }
        return flag;
    }

    private void goToSignUp() {
        startActivity(new Intent(MainActivity.this, SignUp.class));
    }

    private void goToDriverMode() {
        startActivity(new Intent(MainActivity.this, DriverMode.class));
    }
}
