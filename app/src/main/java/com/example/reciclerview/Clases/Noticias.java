package com.example.reciclerview.Clases;

public class Noticias {
    private String titulo;
    private String subtitulo;

    public Noticias(String tit, String sub){
        this.titulo = tit;
        this.subtitulo = sub;
    }
    public String getTitulo(){  return titulo;  }

    public String getSubtitulo(){  return subtitulo; }

    public String toString()
    { return  titulo+""+subtitulo;}
}


