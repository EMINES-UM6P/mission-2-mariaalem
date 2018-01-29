package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by khalidbaba on 28/01/2018.
 */


public class MainActivity extends Activity {


    // TODO : declare all variables (elements AND variables)
    EditText Email;
    EditText Password;
    Button Register;

    String _email;
    String _password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO Instantiate object (EditText and Button)
        Email=(EditText) findViewById(R.id.email);
        Password=(EditText) findViewById(R.id.password);
        Register=(Button) findViewById(R.id.btnLogin);


        //TODO : handle click listener in button and get values from the editText
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             _email=Email.getText().toString();
             _password=Password.getText().toString();
                Intent i= new Intent(MainActivity.this, WelcomeActivity.class);
                i.putExtra("Email",_email);
                i.putExtra("Password",_password);
                startActivity(i);

            }
        });

        //TODO : Create Intent and send email content to the welcome_activity



    }
}
