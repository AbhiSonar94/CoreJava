package com.automation;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    Scanner in = new Scanner(System.in);

    @Test
    public void countWord()
    {
        System.out.println("In this method will pass sentence and get the count of words from it");
        System.out.println("Enter the string");
        String inputString = in.nextLine();

        String[] split = inputString.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<split.length;i++)
        {
            if(map.containsKey(split[i]))
            {
                int count = map.get(split[i]);
                map.put(split[i],count+1);
            } else {
                map.put(split[i],1);
            }
        }
        System.out.println(map);
    }
}
