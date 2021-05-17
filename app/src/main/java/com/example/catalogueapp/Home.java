package com.example.catalogueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rengwuxian.materialedittext.MaterialEditText;

public class Home extends AppCompatActivity {

    TextView gSubject,gGrade1,gGrade2,gAverage,gAbsences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gSubject = (TextView) findViewById(R.id.gSubject);
        gGrade1 = (TextView) findViewById(R.id.gGrade1);
        gGrade2 = (TextView) findViewById(R.id.gGrade2);
        gAverage = (TextView) findViewById(R.id.gAverage);
        gAbsences = (TextView) findViewById(R.id.gAbsences );

    }
}