package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> pairs = new HashMap<>();

        reader.close();

        while(inputStream.available() > 0) {
            Integer input = inputStream.read();
            Integer count = (pairs.containsKey(input) ? pairs.get(input) : 0);
            pairs.put(input, ++count);
        }

        inputStream.close();

        int max = Collections.max(pairs.values());

        for(Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            if(entry.getValue().equals(max)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
