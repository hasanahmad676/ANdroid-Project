package com.example.labperfomance_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnc=findViewById(R.id.btn3);
        btnc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Button C Clicked" , Toast.LENGTH_SHORT).show();

                Intent loadsecond_activity=new Intent(getApplicationContext(),second_activity.class);

                startActivity(loadsecond_activity);


            }
        });






    }

}