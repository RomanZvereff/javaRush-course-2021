package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        FileReader fileReader = null;
        int count = 0;

        try {
            fileReader = new FileReader(args[0]);
            while(fileReader.ready()) {
                int asciiIndex = fileReader.read();
                if((asciiIndex >= 65 && asciiIndex <= 90) || (asciiIndex >= 97 && asciiIndex <= 122)) {
                    count++;
                }
            }

            System.out.println(count);

            fileReader.close();
        }catch(FileNotFoundException e) {
            System.out.println("File not found");
        }catch(IOException e) {
            System.out.println("Oooops!");
        }
    }
}
