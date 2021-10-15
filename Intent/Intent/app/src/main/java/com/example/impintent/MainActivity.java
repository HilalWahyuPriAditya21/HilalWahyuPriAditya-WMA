package com.example.impintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi
    private Button  btnpindah, btnbagikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        btnpindah = findViewById(R.id.btnpindah);
        btnbagikan = findViewById(R.id.btnbagikan);


        btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });

        btnbagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Implicit Success");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
            });
    }
    }
