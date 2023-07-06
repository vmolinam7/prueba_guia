package com.example.reciclerview.Adaptaodres;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.reciclerview.Clases.Noticias;
import com.example.reciclerview.Clases.Usuario;
import com.example.reciclerview.R;

import java.util.ArrayList;

public class AdadtadorUsuario extends ArrayAdapter<Usuario> {

    public AdadtadorUsuario (Context ctx, ArrayList<Usuario> datos){
        super(ctx, R.layout.lyitemusuario, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyitemusuario, null);

        TextView nombre = (TextView)item.findViewById(R.id.lblNombre);
        nombre.setText(getItem(position).getNombres());
        TextView email = (TextView)item.findViewById(R.id.lblEmail);
        email.setText(getItem(position).getEmail());
        TextView web = (TextView)item.findViewById(R.id.lblweb);
        email.setText(getItem(position).getWebsite());

        ImageView imageView = (ImageView)item.findViewById(R.id.imgUsr);
        Glide.with(this.getContext())
                .load(getItem(position).getUrlavatar())
                .into(imageView);
        return(item);
    }
}
