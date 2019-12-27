package com.Denis.lab.task4;

public class Student {

   private int idstudent;
   private String name;

  public Student(int idstudent,String name){
       this.idstudent=idstudent;
       this.name=name;
   }
   public int getIdstudent(){
       return idstudent;
   }
   public String getName(){
       return name;
   }
}
