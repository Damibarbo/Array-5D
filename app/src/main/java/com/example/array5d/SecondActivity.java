package com.example.array5d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    ListView listaStati;
    String nazioni[]={"Italia","Germania","Inghilterra","Francia"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listaStati=(ListView)findViewById(R.id.listViewStati);
        ArrayAdapter<String> adStati=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nazioni);
        listaStati.setAdapter(adStati);
    }
}
