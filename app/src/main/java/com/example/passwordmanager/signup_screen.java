package com.example.passwordmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        Button submit_Btn = (Button) findViewById(R.id.submit_Btn);
        submit_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editNewEmail = (EditText) findViewById(R.id.editNewEmail);
                EditText editNewPassword = (EditText) findViewById(R.id.editNewPassword);
                EditText editNewPassword2 = (EditText) findViewById(R.id.editNewPassword2);
                EditText editPhone = (EditText) findViewById(R.id.editPhone);
                TextView signup_text = (TextView) findViewById(R.id.signup_text);

                String newEmail = editNewEmail.getText().toString();
                //create if statement here to make sure the two passwords match
                String newPassword1 = editNewPassword.getText().toString();
                String newPassword2 = editNewPassword2.getText().toString();
                String errorPass = "Passwords don't match";

                String newPhone = editPhone.getText().toString();
                String succ1 = "Successfully entered";
                signup_text.setText(succ1 + " password is " + newPassword1 );
            }
        });
    }
}
