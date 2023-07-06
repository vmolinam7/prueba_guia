
package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.reciclerview.Adaptaodres.AdaptadoresNoticias;
import com.example.reciclerview.Clases.Noticias;

import Interfaces.iListaAlumnis;

public class MainActivity3ListViewPersonalizado extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public Noticias[] noticias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_list_view_personalizado);

               noticias =new Noticias[]{
                        new Noticias("Noticia 1", "SubNoticia Contenido Contenido Contenido Contenido 1"),
                        new Noticias("Noticia 2", "SubNoticia Contenido Contenido Contenido Contenido 2"),
                        new Noticias("Noticia 3", "SubNoticia Contenido Contenido Contenido Contenido 3"),
                        new Noticias("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 4")};
        //adaptador
         AdaptadoresNoticias adaptadornoticias = new AdaptadoresNoticias(this,
                noticias);
        //Vistas
        ListView lstOpciones = (ListView)findViewById(R.id.Ochy);
         lstOpciones.setAdapter(adaptadornoticias);
       // lstOpciones.setOnItemClickListener(new iListaAlumnis(this.getApplicationContext()));
        View header = getLayoutInflater().inflate(R.layout.lyheard, null);
        lstOpciones.addHeaderView(header);
        lstOpciones.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(MainActivity3ListViewPersonalizado.this, VerNoticia.class);
        Bundle b = new Bundle();
        Noticias noticia =(Noticias)adapterView.getItemAtPosition(i);
        b.putString("Titulo",noticia.getTitulo());
        b.putString("SubTitulo",noticia.getSubtitulo());
        intent.putExtras(b);
        startActivity(intent);
    }
}