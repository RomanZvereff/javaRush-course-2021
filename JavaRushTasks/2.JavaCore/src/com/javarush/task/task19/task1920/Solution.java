package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> filePairs = new TreeMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        while(bufferedReader.ready()) {
            String[] pair = bufferedReader.readLine().split(" ");
            String name = pair[0];
            Double amount = Double.parseDouble(pair[1]);
            Double total = filePairs.containsKey(name) ? (filePairs.get(name) + amount) : amount;
            filePairs.put(name, total);
        }
        bufferedReader.close();
        double max = filePairs.values().stream().max(Double::compareTo).get();

        for(Map.Entry<String, Double> entry : filePairs.entrySet()) {
            if(entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
            }
        }

    }
}
