package com.Denis.ind.ind1_struct;

public class Kino {
    private int idkino;
    private String title;

    Kino(int idkino,String title){
        this.idkino=idkino;
        this.title=title;
    }
    public int getIdkino(){
        return idkino;
    }
    public String getTitle(){
        return title;
    }
}
