//31.10.19 Шаблоны программирования
package com.Denis.lab.tasl5;

public class Singleton {
    private static Singleton instance ;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
