package com.javarush.task.task19.task1906;

import java.io.*;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String firstFile = bufferedReader.readLine();
            String secondFile = bufferedReader.readLine();
            bufferedReader.close();

            int counter = 0;

            FileReader fileReader = new FileReader(firstFile);
            FileWriter fileWriter = new FileWriter(secondFile);
            while(fileReader.ready()) {
                int c = fileReader.read();
                counter++;
                if(counter % 2 == 0) {
                    fileWriter.write(c);
                }
            }

            fileReader.close();
            fileWriter.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
