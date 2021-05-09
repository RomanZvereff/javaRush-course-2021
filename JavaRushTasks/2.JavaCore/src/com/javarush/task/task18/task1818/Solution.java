package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        String firstFile = null;
        String secondFile = null;
        String thirdFile = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            firstFile = reader.readLine();
            secondFile = reader.readLine();
            thirdFile = reader.readLine();

            reader.close();

            fileWriter = new FileWriter(firstFile, true);
            fileReader = new FileReader(secondFile);

            while(fileReader.ready()) {
                fileWriter.write((char)fileReader.read());
            }
            fileReader.close();

            fileReader = new FileReader(thirdFile);
            while(fileReader.ready()) {
                fileWriter.write((char)fileReader.read());
            }
            fileReader.close();
            fileWriter.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
