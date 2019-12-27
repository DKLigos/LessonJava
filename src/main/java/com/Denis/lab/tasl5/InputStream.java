package com.Denis.lab.tasl5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


abstract class InputStream1 {
    public abstract int read();

    public static void main(String[] args) throws Exception {
        try {
            InputStream in = new FileInputStream("test.txt");
            while (in.available() > 0) {
                System.out.println(in.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

           catch(IOException e) {
             System.out.println("Error"+ e);
             throw e;


        }

    }
}
