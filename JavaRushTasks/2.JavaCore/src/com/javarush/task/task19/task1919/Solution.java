package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        try {
            TreeMap<String, Double> pairs = new TreeMap<>();
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            while(reader.ready()) {
                String[] fileStr = reader.readLine().split(" ");
                String lastName = fileStr[0];
                Double salary = Double.parseDouble(fileStr[1]);
                Double allSalary = pairs.containsKey(fileStr[0]) ? (pairs.get(fileStr[0]) + salary) : salary;
                pairs.put(lastName, allSalary);
            }
            reader.close();

            for(Map.Entry<String, Double> entry : pairs.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
