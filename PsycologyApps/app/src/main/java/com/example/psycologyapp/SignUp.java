package com.example.psycologyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignUp extends AppCompatActivity {

    Administrator accounts;
    EditText name;
    EditText email;
    EditText address;
    EditText phone;
    Button signUp;
    FirebaseDatabase databaseAccouts;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);





        name = findViewById(R.id.userName);
        email = findViewById(R.id.userName);
        address = findViewById(R.id.userAddress);
        phone = findViewById(R.id.userPhone);
        signUp = findViewById(R.id.ComfirmSignUp);

        databaseAccouts = FirebaseDatabase.getInstance();
        ref = databaseAccouts.getReference();

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ComfirmSignUp();

            }
        });
    }


    private void getValue(){
//        accounts.setUserName(name.getText().toString().trim());
//        accounts.setUserAddress(address.getText().toString().trim());
//        accounts.setUserPhone(phone.getText().toString().trim());
//        accounts.setUserEmail(email.getText().toString().trim());
    }



    public void ComfirmSignUp(){
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getValue();
                ref.setValue(accounts);
                System.out.println(("Good"));
                Toast.makeText(SignUp.this, "Sign up Successfully!!", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                System.out.println(("Bad"));
                Toast.makeText(SignUp.this, "Sign up incomplete..", Toast.LENGTH_LONG).show();

            }
        });
    }

}
