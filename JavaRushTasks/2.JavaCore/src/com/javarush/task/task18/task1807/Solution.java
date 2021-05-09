package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileInputStream inputStream = null;
        int count = 0;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            inputStream = new FileInputStream(reader.readLine());

            reader.close();

            while(inputStream.available() > 0) {
                int input = inputStream.read();
                if(input == 44) {
                    count++;
                }
            }
            inputStream.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
