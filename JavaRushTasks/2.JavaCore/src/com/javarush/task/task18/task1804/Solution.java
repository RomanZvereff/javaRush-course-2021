package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> pairs = new HashMap<>();

        reader.close();

        while(inputStream.available() > 0) {
            Integer inputByte = inputStream.read();
            Integer count = (pairs.containsKey(inputByte) ? pairs.get(inputByte) : 0);
            pairs.put(inputByte, ++count);
        }

        inputStream.close();

        Integer min = Collections.min(pairs.values());

        for(Map.Entry<Integer, Integer> entry: pairs.entrySet()) {
            if(entry.getValue().equals(min)) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
