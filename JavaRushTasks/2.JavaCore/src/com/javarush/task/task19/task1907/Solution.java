package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String fileName = bufferedReader.readLine();
            bufferedReader.close();

            int counter = 0;

            bufferedReader = new BufferedReader(new FileReader(fileName));
            while(bufferedReader.ready()) {
                String[] str = bufferedReader.readLine().split("\\p{Punct}|\\s");
                for(String s : str) {
                    if(s.equals("world")) {
                        counter++;
                    }
                }
            }
            bufferedReader.close();

            System.out.println(counter);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
