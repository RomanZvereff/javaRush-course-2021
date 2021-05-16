package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]))) {
            while(bufferedReader.ready()) {
                String inputStr = bufferedReader.readLine();
                String[] strArray = inputStr.split(" ");
                for(String s : strArray) {
                    if(s.matches(".*\\d.*")) {
                        bufferedWriter.write(s + " ");
                    }
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
