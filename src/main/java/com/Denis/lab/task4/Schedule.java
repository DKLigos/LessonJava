package com.Denis.lab.task4;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    List<Lesson> lessons;

   public Schedule(List<Lesson> lessons){
        this.lessons=lessons;
    }
    public List<Lesson> getStudentSchedule(String name){
        List<Lesson> studentSchedule= new ArrayList<Lesson>();
        for(Lesson lesson: lessons ){
          Group stGroup=lesson.getGroup();
          boolean flag=false;
          for (Student student: stGroup.getStudents()) {
              if (student.getName()==name) flag=true ;
          }
          if (flag) studentSchedule.add(lesson);
        }
        return studentSchedule;

    }
    public  List<Lesson> findStudent(String studentname) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Schedule schedule = new Schedule(lessons);
        List<Lesson> schStudent = schedule.getStudentSchedule(studentname);
        List<Lesson> lessons = new ArrayList<Lesson>();

        for (int i = 0; i < 7; ++i) {
            System.out.println(days[i]);
            for (Lesson lesson : schStudent) {
                if (i == lesson.getIdDay()) {
                    lessons.add(lesson);
                }
            }

        }
        return lessons;
    }

    public static void main(String[] args) {

        String[] days={"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        List<Student> kitList = new ArrayList<Student>();
        List<Student> fpmList = new ArrayList<Student>();

        Student denis = new Student(0123173,"Kornienko Denis");
        Student igor = new Student(0123174,"Masenko Igor");

        kitList.add(denis);
        fpmList.add(igor);

        Group kit = new Group(1,"Kit",kitList);
        Group fpm = new Group(1,"Фпм",fpmList);

        Lesson lesson1 = new Lesson(0, 0,LocalTime.of(8,0),"Algebra",kit);
        Lesson lesson2 = new Lesson(1, 0,LocalTime.of(9,40),"Algebra",kit);
        Lesson lesson3 = new Lesson(3,0 ,LocalTime.of(11,30),"Algebra",kit);
        Lesson lesson4 = new Lesson(4, 0,LocalTime.of(11,30),"Prolog",fpm);

        List<Lesson> lessons = new ArrayList<Lesson>();
        lessons.add(lesson1);
        lessons.add(lesson2);
        lessons.add(lesson3);
        lessons.add(lesson4);

        Schedule schedule = new Schedule(lessons);
        List<Lesson> schStudent= schedule.getStudentSchedule("Kornienko Denis");

        for(int i=0 ; i<7; ++i ){
            System.out.println(days[i]);
            for (Lesson lesson : schStudent) {
                if (i==lesson.getIdDay()){
                    System.out.println("\ntime: \t\t" + lesson.getTime());
                    System.out.println("Subject: \t" + lesson.getSubject());
                    System.out.println("group: \t\t" + lesson.getGroup().getName());
                    System.out.println();
                }
            }
    }   }
}
