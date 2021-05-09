package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = null;
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        String firstFile = null;
        String secondFile = null;
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));
            firstFile = reader.readLine();
            secondFile = reader.readLine();
            reader.close();

            inputStream = new FileInputStream(firstFile);
            while(inputStream.available() > 0) {
                arrayList.add(inputStream.read());
            }
            inputStream.close();

            outputStream = new FileOutputStream(secondFile);
            for(int i = (arrayList.size() - 1); i >= 0; i--) {
                outputStream.write(arrayList.get(i));
            }
            outputStream.close();

        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
