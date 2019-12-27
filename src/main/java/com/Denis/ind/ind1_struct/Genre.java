package com.Denis.ind.ind1_struct;

import java.util.List;

public class Genre {
    private int idgenre;
    private String title;
    List<Kino> kino;

    Genre(int idgenre, String title, List<Kino> kino){
        this.idgenre=idgenre;
        this.title=title;
        this.kino= kino;
    }
    public int getIdgenre(){
        return idgenre;
    }
    public String getTitle(){
        return title;
    }
    public List<Kino> getKino(){
        return kino;
    }
    public  void printStudents(){
        for (Kino kino: kino){
            System.out.println(kino.getTitle()+ "\t" +kino.getIdkino());
        }
    }
}
