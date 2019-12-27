package com.Denis.lab.task2;

import java.util.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


 class OperntionsTest {


    private static int  Summ(int a, int b) {
        return a+b;
    }

    private Map<String, Integer> N1(String string1){
        //String string1 = "Help me a b c c";
        String[] words = string1.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap();
        for (String word : words)
        {
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
      return wordToCount;

    }


    @Test
    public void testN1()
    {
        Map<String, Integer> myMap = new HashMap<String, Integer>() {{
            put("a", 1);
            put("c", 2);
        }};

        Map<String, Integer> myMap1 = new HashMap<String, Integer>() {{
            put("a", 1);
            put("c", 3);
        }};
        //Assertions.assertEquals(4,Summ(2,2));
        Assertions.assertEquals(myMap,N1("c c a"));
        Assertions.assertEquals(myMap1,N1("c c a"));
    }
     @Test
     public void testN2()
     {
         Map<String, Integer> myMap1 = new HashMap<String, Integer>() {{
             put("a", 1);
             put("c", 3);
         }};
         //Assertions.assertEquals(4,Summ(2,2));
         Assertions.assertEquals(myMap1,N1("c c a"));
     }


}
