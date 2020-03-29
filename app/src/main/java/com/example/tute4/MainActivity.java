package com.example.tute4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.tute4.Database.DBHelper;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnSignin, btnDelete, btnUpdate;
    EditText editTextName, editTextPW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd= findViewById(R.id.buttonAdd);
        btnSignin = findViewById(R.id.buttonsignin);
        btnDelete = findViewById(R.id.buttonDelete);
        btnUpdate = findViewById(R.id.buttonUpdate);
        editTextName = findViewById(R.id.editTextName);
        editTextPW = findViewById(R.id.editTextPassword);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper db1 = new DBHelper();
                db1.addInfo();
            }
        });

    }
}
