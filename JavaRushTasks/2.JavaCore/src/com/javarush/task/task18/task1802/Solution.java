package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while(inputStream.available() > 0) {
            min = Math.min(min, inputStream.read());
        }
        reader.close();
        inputStream.close();
        System.out.println(min);
    }
}
