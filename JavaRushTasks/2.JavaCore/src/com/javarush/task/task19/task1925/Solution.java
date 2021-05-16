package com.javarush.task.task19.task1925;

import java.io.*;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            StringBuilder builder = new StringBuilder();
            while(reader.ready()) {
                String[] inputLine = reader.readLine().split(" ");
                for(String s : inputLine) {
                    if(s.length() > 6) {
                        builder.append(s + ",");
                    }
                }
            }
            writer.write(builder.toString().substring(0, builder.length() - 1));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
