package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int max = Integer.MIN_VALUE;

        FileInputStream inputStream = new FileInputStream(fileName);
        while(inputStream.available() > 0) {
            int inputByte = inputStream.read();
            max = Math.max(max, inputByte);
        }

        reader.close();
        inputStream.close();

        System.out.println(max);
    }
}
