package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
Button buttonNastepne;
RadioButton radioButtonA,RadioButtonB, RadioButtonC;
RadioGroup radioGroupPytania;
TextView textViewTresc;
List<Pytanie> pytanieZInternetu;
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


        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://my-json-server.typicode.com/aGith0bszkola/retrofit_pytania_matematyka/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
            JsonPlaceHolder jsonPlaceHolder = retrofit.create(JsonPlaceHolder.class);
        Call<List<Pytanie>> call = jsonPlaceHolder.getPytania();
        call.enqueue(
                new Callback<List<Pytanie>>() {
                    @Override
                    public void onResponse(Call<List<Pytanie>> call, Response<List<Pytanie>> response) {
                        if(!response.isSuccessful())
                        {
                            Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
                            return;
                        }
                        pytanieZInternetu=response.body();
                        textViewTresc.setText("Pytanie" +pytanieZInternetu.get(0).getTrescPytania());
                    }

                    @Override
                    public void onFailure(Call<List<Pytanie>> call, Throwable t) {

                    }
                }
        );
    }
    private void wypiszPytanie(int nrPytania){
        textViewTresc.setText(pytanieZInternetu.get(nrPytania).getTrescPytania());
        radioButtonA.setText(pytanieZInternetu.get(nrPytania).getOpdaA());
        radioButtonA.setText(pytanieZInternetu.get(nrPytania).getOdpB());
        radioButtonA.setText(pytanieZInternetu.get(nrPytania).getOdpC());
    }

}