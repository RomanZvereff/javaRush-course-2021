package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(args[0]);
            double countWhiteSpace = 0;
            double countAll = 0;
            while(reader.ready()) {
                if((char)reader.read() == ' ') {
                    countWhiteSpace++;
                }
                countAll++;
            }
            reader.close();

            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            System.out.println(decimalFormat.format(countWhiteSpace / countAll * 100));
        }catch(IOException e) {
            e.printStackTrace();
        }


    }
}
