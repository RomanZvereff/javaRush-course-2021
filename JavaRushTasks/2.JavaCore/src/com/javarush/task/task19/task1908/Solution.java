package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = null;

        try {
            String firstFile = bufferedReader.readLine();
            String secondFile = bufferedReader.readLine();
            bufferedReader.close();

            bufferedReader = new BufferedReader(new FileReader(firstFile));
            bufferedWriter = new BufferedWriter(new FileWriter(secondFile));

            while(bufferedReader.ready()) {
                String[] str = bufferedReader.readLine().split("\\p{Punct}|\\s");
                for(String s : str) {
                    if(s.matches("-?\\d+(\\.\\d+)?")) {
                        bufferedWriter.write(s + " ");
                    }
                }
            }

            bufferedReader.close();
            bufferedWriter.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
