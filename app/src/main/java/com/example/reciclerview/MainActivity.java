package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] datos =
                new
                        String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
        Spinner cmbOpciones = (Spinner) findViewById(R.id.txtIte);
         adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
         cmbOpciones.setAdapter(adaptador);
         cmbOpciones.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
     text=findViewById(R.id.textView);
     text.setText("Has seleccionado "+adapterView.getItemAtPosition(i).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        text=findViewById(R.id.textView);
        text.setText("");
    }
}