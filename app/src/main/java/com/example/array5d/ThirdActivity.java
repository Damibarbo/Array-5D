package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView film;
    ImageView poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent i = getIntent();
        String nome = i.getStringExtra("nomeFilm");
        int immagine=i.getIntExtra("immagine",0);
        poster=findViewById(R.id.image);
        film=(TextView) findViewById(R.id.nome);
        film.setText(nome);
        poster.setImageResource(immagine);

    }
}

