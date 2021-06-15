package com.javarush.task.task19.task1926;

import java.io.*;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = reader.readLine();
            reader.close();
            reader = new BufferedReader(new FileReader(fileName));
            while(reader.ready()) {
                System.out.println(new StringBuilder(reader.readLine()).reverse().toString());
            }
            reader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
