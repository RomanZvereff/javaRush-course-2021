package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = null;
        String firstFile = null;
        String secondFile = null;
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            firstFile = reader.readLine();
            secondFile = reader.readLine();
            reader.close();

            ArrayList<Character> firstFileData = new ArrayList<>();

            fileReader = new FileReader(firstFile);
            while(fileReader.ready()) {
                firstFileData.add((char)fileReader.read());
            }
            fileReader.close();

            fileWriter = new FileWriter(firstFile);
            fileReader = new FileReader(secondFile);
            while(fileReader.ready()) {
                fileWriter.write(fileReader.read());
            }

            for(Character c : firstFileData) {
                fileWriter.write(c);
            }

            fileReader.close();
            fileWriter.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
