package com.Denis.ind.ind1_struct;

import java.time.LocalTime;
public class Lesson {
    private int idDay;
    private LocalTime time;
    private String film;
    private Genre genre;
    private String[] days={"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    Lesson(int idDay, LocalTime time, String film, Genre genre){
        this.idDay=idDay;
        this.time=time;
        this.film=film;
        this.genre=genre;
    }
    public int getIdDay(){
        return idDay;
    }
    public LocalTime getTime(){
        return time;
    }
    public String getFilm(){
        return film;
    }
    public Genre getGenre(){
        return genre;
    }
    public String getDay(int idDay){
        return days[idDay];
    }

    public void printLesson(){
        System.out.println("Day : \t" + days[idDay]);
        System.out.println("time : \t" + time);
        System.out.println("Subject : \t" + film);
        System.out.println("group : \t" + genre.getIdgenre());
    }

}
