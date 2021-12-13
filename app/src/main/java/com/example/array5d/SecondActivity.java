package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    ListView listaStati;
    String films[]={"spiderman","Escape plan","Ritorno al futuro","Se son rose"};
    int [] posterFilm={R.drawable.uomoragno,R.drawable.escapeplan, R.drawable.raf,R.drawable.sesonrose};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listaStati=(ListView)findViewById(R.id.listViewStati);
        ArrayAdapter<String> adStati=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,films);
        listaStati.setAdapter(adStati);

        listaStati.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),ThirdActivity.class);
                i.putExtra("nomeFilm",films[position]);
                i.putExtra("immagine",posterFilm[position]);
                startActivity(i);
            }
        });
    }

}
