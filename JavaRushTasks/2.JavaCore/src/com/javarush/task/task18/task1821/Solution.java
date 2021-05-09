package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader(args[0])) {
            Map<Integer, Integer> pairs = new HashMap<>();

            while(fileReader.ready()) {
                int i = fileReader.read();
                int count = pairs.containsKey(i) ? pairs.get(i) : 0;
                pairs.put(i, count + 1);
            }
            fileReader.close();

            TreeMap<Integer, Integer> sortedMap = new TreeMap<>(pairs);
            
            for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
                int i = entry.getKey();
                System.out.println((char)i + " " + entry.getValue());
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
