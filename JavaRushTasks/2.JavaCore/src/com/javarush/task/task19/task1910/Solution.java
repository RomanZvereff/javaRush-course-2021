package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
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
                String str = bufferedReader.readLine().replaceAll("\\p{Punct}|\\n", "");
                bufferedWriter.write(str);
            }

            bufferedReader.close();
            bufferedWriter.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
