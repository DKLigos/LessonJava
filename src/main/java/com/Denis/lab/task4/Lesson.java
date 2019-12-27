package com.Denis.lab.task4;

import java.time.LocalTime;

public class Lesson {
    private  int id;
    private int idDay;
    private LocalTime time;
    private String subject;
    private Group group;
    private String[] days={"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    //private int idteacher;
   public Lesson( int id, int idDay, LocalTime time, String subject, Group group){
       this.id=id;
        this.idDay=idDay;
        this.time=time;
        this.subject=subject;
        this.group=group;
    }
    public  int getid(){return  id;}
    public int getIdDay(){
        return idDay;
    }
    public LocalTime getTime(){
        return time;
    }
    public String getSubject(){
        return subject;
    }
    public Group getGroup(){
        return group;
    }
    public String getDay(int idDay){
        return days[idDay];
    }

    public void printLesson(){
        System.out.println("id: \t" + id);
        System.out.println("Day : \t" + days[idDay]);
        System.out.println("time : \t" + time);
        System.out.println("Subject : \t" + subject);
        System.out.println("group : \t" + group.getIdgroup());
    }

}
