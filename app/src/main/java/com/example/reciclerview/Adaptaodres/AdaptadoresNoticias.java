package com.example.reciclerview.Adaptaodres;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.reciclerview.Clases.Noticias;
import com.example.reciclerview.R;

public class AdaptadoresNoticias extends ArrayAdapter<Noticias> {
    public AdaptadoresNoticias (Context ctx,  Noticias[] datos){
        super(ctx, R.layout.lyitenoticia, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyitenoticia, null);
        TextView lblTitulo = (TextView)item.findViewById(R.id.LblTitulo);
        lblTitulo.setText(getItem(position).getTitulo());
        TextView lblSubtitulo = (TextView)item.findViewById(R.id.LblSubTitulo);
        lblSubtitulo.setText(getItem(position).getSubtitulo());
        return(item);
    }

}
