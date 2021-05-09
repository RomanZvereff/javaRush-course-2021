package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        try {
            String firstFile = bufferedReader.readLine();
            String secondFile = bufferedReader.readLine();
            bufferedReader.close();

            List<Double> list = new ArrayList<>();

            bufferedReader = new BufferedReader(new FileReader(firstFile));
            while(bufferedReader.ready()) {
                String[] inputStr = bufferedReader.readLine().split(" ");
                for(String s: inputStr) {
                    Double d = Double.parseDouble(s);
                    list.add(d);
                }
            }
            bufferedReader.close();

            FileWriter fileWriter = new FileWriter(secondFile, true);
            for(Double d : list) {
                String i = String.valueOf((int)Math.round(d));
                fileWriter.write(i + " ");
            }

            fileWriter.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
