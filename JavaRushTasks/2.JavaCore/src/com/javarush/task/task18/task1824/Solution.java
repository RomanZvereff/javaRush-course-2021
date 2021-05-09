package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = null;

        while(true) {
            try {
                filePath = reader.readLine();
                FileReader fileReader = new FileReader(filePath);
                fileReader.close();
            }catch(FileNotFoundException e) {
                System.out.println(filePath);
                return;
            }catch(IOException e) {

            }
        }
    }
}
