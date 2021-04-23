package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(99.99, "J");
        labels.put(19.99, "a");
        labels.put(29.99, "v");
        labels.put(39.99, "a");
        labels.put(49.99, "!");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
