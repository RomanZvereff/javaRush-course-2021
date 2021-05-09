package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader(args[1]);
            fileWriter = new FileWriter(args[2]);

            while(fileReader.ready()) {
                if(args[0].equals("-e")) {
                    int input = fileReader.read();
                    fileWriter.write(input + 1);
                }
                if(args[0].equals("-d")) {
                    int input = fileReader.read();
                    fileWriter.write((char)(input - 1));
                }
            }
            fileReader.close();
            fileWriter.close();
        }catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
