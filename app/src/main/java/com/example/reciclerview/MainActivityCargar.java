package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.reciclerview.Adaptaodres.AdadtadorUsuario;
import com.example.reciclerview.Clases.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import webService.Asynchtask;
import webService.WebService;

public class MainActivityCargar extends AppCompatActivity implements Asynchtask{ ListView lstOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cargar);

        ListView lstOpciones = (ListView)findViewById(R.id.Ochy2);
        View header = getLayoutInflater().inflate(R.layout.lyheard, null);
        lstOpciones.addHeaderView(header);
        Map<String, String> datos = new HashMap<String, String>();
        WebService ws= new WebService("https://reqres.in/api/users",
                datos, MainActivityCargar.this,  MainActivityCargar.this);
        ws.execute("GET");

    }


    @Override
    public void processFinish(String result) throws JSONException {
        ListView lstOpciones = (ListView)findViewById(R.id.Ochy2);
        JSONObject JSONlista = new JSONObject(result);
        ArrayList<Usuario> usuario;
        JSONArray JSONlistaUsuarios= JSONlista.getJSONArray("data");
        usuario = Usuario.JsonObjectsBuild(JSONlistaUsuarios);
        AdadtadorUsuario adapatorUsuario = new AdadtadorUsuario(this,usuario );
        lstOpciones.setAdapter(adapatorUsuario);

    }
}