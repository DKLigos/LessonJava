package com.Denis.lab.task2;

import com.Denis.lab.task4.Group;
import com.Denis.lab.task4.Lesson;
import com.Denis.lab.task4.Schedule;
import com.Denis.lab.task4.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Arrays;

public class ScheduleTest {
    @Test
    public void schedule(){
        Student studentAnn = new Student(1,"Ann");
        Student studentJann = new Student(2,"Jann");
        Group group1 = new Group(1,"Kit", Arrays.asList(studentAnn));
        Group group2 = new Group(1,"Fpm", Arrays.asList(studentJann));
        Lesson lesson1 = new Lesson(0, 0, LocalTime.of(8,0),"Algebra", group1);
        Lesson lesson2 = new Lesson(0, 0, LocalTime.of(9,40),"Java", group1);
        Schedule schedule = new Schedule(Arrays.asList(lesson1,lesson2));

        Assertions.assertEquals(Arrays.asList(lesson1,lesson2),schedule.findStudent("Ann"));
       // Assertions.assertEquals(Arrays.asList(lesson1,lesson2),schedule.findStudent("Annn"));

    }
}
