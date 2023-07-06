package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VerNoticia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_noticia);
        Bundle b = new Bundle();
        b=this.getIntent().getExtras();
        TextView txttituloNoticia = (TextView)findViewById(R.id.TxtView);
        txttituloNoticia.setText(b.getString("Titulo"));
        TextView txtsub = (TextView)findViewById(R.id.txtView1);
        txtsub.setText(b.getString("SubTitulo"));
    }
}