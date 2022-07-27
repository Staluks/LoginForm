package com.example.form;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// button function
    @SuppressLint("SetTextI18n")
    public void submit(View view) {
        TextView text = findViewById(R.id.text);
        TextInputEditText inUser = findViewById(R.id.inputUser);
        text.setText("Username: " + inUser.getText());
        inUser.setText("");

        TextView emailTxt = findViewById(R.id.emailTxt);
        TextInputEditText inEmail = findViewById(R.id.inputEmail);
        emailTxt.setText("Email: " + inEmail.getText());
        inEmail.setText("");

        TextView phoneTxt = findViewById(R.id.phoneTxt);
        TextInputEditText inPhone = findViewById(R.id.inputPhone);
        phoneTxt.setText("Phone: " + inPhone.getText());
        inPhone.setText("");

        TextView cityTxt = findViewById(R.id.cityTxt);
        TextInputEditText inCity = findViewById(R.id.inputCity);
        cityTxt.setText("City: " + inCity.getText());
        inCity.setText("");

        TextView passwordTxt = findViewById(R.id.passwordTxt);
        TextInputEditText inPassword = findViewById(R.id.inputPassword);
        passwordTxt.setText("Password: " + inPassword.getText());
        inPassword.setText("");


    }

}