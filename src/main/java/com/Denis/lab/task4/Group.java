package com.Denis.lab.task4;

import java.util.ArrayList;
import java.util.List;

public class Group {
  private int idgroup;
  private String name;
  private List<Student> students;

  public Group(int idgroup, String name, List<Student> students){
      this.idgroup=idgroup;
      this.name=name;
      this.students= students;
  }
  public int getIdgroup(){
      return idgroup;
  }
  public String getName(){
        return name;
  }
  public List<Student> getStudents(){
      return students;
  }
  public  void printStudents(){
      for (Student student: students){
          System.out.println(student.getName()+ "\t" +student.getIdstudent());
      }
  }
}
