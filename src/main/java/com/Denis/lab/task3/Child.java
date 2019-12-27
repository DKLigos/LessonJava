package com.Denis.lab.task3;

public class Child extends Parent {
    public void print(){System.out.println("Введите текст");}
    public static void main(String[] args){
        Child child= new Child();
        child.print();
    }
}
