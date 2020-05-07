package com.example.pip_boy;

import android.app.Person;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class PersonalInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        Button confirm = (Button)findViewById(R.id.buttonGenerate);
        // declare all fields
        final EditText name = (EditText) findViewById(R.id.firstnamebox);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // store in intent from website I showed you and pass in intent
                EditText mAge = (EditText)findViewById(R.id.inputAge);
                EditText mName = (EditText)findViewById(R.id.firstnamebox);
                Spinner mGender = (Spinner)findViewById(R.id.genderSpinner);
                Spinner mClass = (Spinner)findViewById(R.id.classType);
                String age = (String) mAge.getText().toString();
                String name = (String) mName.getText().toString();
                String gender = (String) mGender.getSelectedItem().toString();
                String classType = (String) mClass.getSelectedItem().toString();
                //make new intent to carry it across activities
                Intent i = new Intent(PersonalInfo.this, MainActivity.class);
                i.putExtra("age", age);
                i.putExtra("name", name);
                i.putExtra("gender", gender);
                i.putExtra("class", classType);
                startActivity(i);
            }
        });
    }
}