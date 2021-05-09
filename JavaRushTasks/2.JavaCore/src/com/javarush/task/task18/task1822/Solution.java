package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.ArrayList;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileData = new ArrayList<>();
        try {
            String fileName = bufferedReader.readLine();
            bufferedReader.close();

            bufferedReader = new BufferedReader(new FileReader(fileName));
            while(bufferedReader.ready()) {
                fileData.add(bufferedReader.readLine());
            }
            bufferedReader.close();

            for(String s : fileData) {
                Integer id = Integer.parseInt(s.substring(0, s.indexOf(" ")));
                if(id.equals(Integer.parseInt(args[0]))) {
                    System.out.println(s);
                }
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
