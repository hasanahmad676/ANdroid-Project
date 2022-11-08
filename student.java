package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_student extends AppCompatActivity {

    Button btnStudent ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);


        btnStudent = findViewById(R.id.btnSubmit);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Thank you for registration", Toast.LENGTH_SHORT).show();
                Intent loadStudentActivity =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(loadStudentActivity);
            }
        });









    }
}