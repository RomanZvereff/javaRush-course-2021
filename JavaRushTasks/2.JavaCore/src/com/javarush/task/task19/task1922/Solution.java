package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName = bufferedReader.readLine();
            bufferedReader.close();

            int counter = 0;
            bufferedReader = new BufferedReader(new FileReader(fileName));
            while(bufferedReader.ready()) {
                String inputLine = bufferedReader.readLine();
                String[] wordArray = inputLine.split(" ");
                counter = 0;
                for(int i = 0; i < wordArray.length; i++) {
                    for(int j = 0; j < words.size(); j++) {
                        if(wordArray[i].equals(words.get(j))) {
                            counter++;
                        }
                    }
                }
                if(counter == 2) {
                    System.out.println(inputLine);
                }

            }
            bufferedReader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
