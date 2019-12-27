package com.Denis.ind.ind1_struct;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import  com.google.gson.Gson;

public class Schedule {
    List<Lesson> lessons;

    Schedule(List<Lesson> lessons){
        this.lessons=lessons;
    }
    public List<Lesson> getKinoSchedule(String title){
        List<Lesson> kinoSchedule= new ArrayList<Lesson>();
        for(Lesson lesson: lessons ){
            Genre stGenre=lesson.getGenre();
            boolean flag=false;
            for (Kino kino: stGenre.getKino()) {
                if (kino.getTitle()==title) flag=true ;
            }
            if (flag) kinoSchedule.add(lesson);
        }
        return kinoSchedule;

    }
    public static void main(String[] args) {

        String[] days={"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        List<Kino> dramaList = new ArrayList<Kino>();
        List<Kino> actionList = new ArrayList<Kino>();

        Kino Titanik = new Kino(1,"Titanik");
        Kino Avatar = new Kino(2,"Avatar");

        dramaList.add(Titanik);
        actionList.add(Avatar);

        Genre drama = new Genre(1,"drama",dramaList);
        Genre action = new Genre(1,"action",actionList);

        Lesson lesson1 = new Lesson(0,LocalTime.of(8,0),"Avatar",action);
        Lesson lesson2 = new Lesson(0,LocalTime.of(9,40),"Avatar",action);
        Lesson lesson3 = new Lesson(0,LocalTime.of(11,30),"Avatar",action);
        Lesson lesson4 = new Lesson(1,LocalTime.of(11,30),"Titanik",drama);

        List<Lesson> lessons = new ArrayList<Lesson>();
        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);
        lessons.add(lesson4);

        Schedule schedule = new Schedule(lessons);
        List<Lesson> schKino= schedule.getKinoSchedule("Avatar");

//        Gson gson = new Gson();
//        String json = gson.toJson(schedule);
//        System.out.println(json);
//        Schedule schedule1 = gson.fromJson(json,Schedule.class);
//        System.out.println(schedule1.lessons.get(2).getFilm());

        for(int i=0 ; i<7; ++i ){
            System.out.println(days[i]);
            for (Lesson lesson : schKino) {
                if (i==lesson.getIdDay()){

                    System.out.println("\ntime: \t\t" + lesson.getTime());
                    System.out.println("Film: \t" + lesson.getFilm());
                    System.out.println("genre: \t\t" + lesson.getGenre().getTitle());
                    System.out.println();
                }
            }
        }   }
}
