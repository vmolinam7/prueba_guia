package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import Interfaces.iListaAlumnis;

public class MainActivity2ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //los datos
        final String[] datos =
                new
                        String[]{"1","2","3","4","5"};
        //adaptador
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, datos);
        //Vista
        ListView lstOpciones = (ListView)findViewById(R.id.textList);
         lstOpciones.setAdapter(adaptador2);
         lstOpciones.setOnItemClickListener(new iListaAlumnis(this.getApplicationContext()));

    }


}