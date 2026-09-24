package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button buttonNastepne;
RadioButton radioButtonA,RadioButtonB, RadioButtonC;
RadioGroup radioGroupPytania;
TextView textViewTresc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            buttonNastepne = findViewById(R.id.button);
            radioButtonA = findViewById(R.id.radioButton);
            RadioButtonB = findViewById(R.id.radioButton2);
            RadioButtonC = findViewById(R.id.radioButton3);
            textViewTresc = findViewById(R.id.textViewPytanie);
            radioGroupPytania = findViewById(R.id.RadioGrupa);

    }

}