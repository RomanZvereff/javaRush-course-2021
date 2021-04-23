package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Map<String, String> params = new LinkedHashMap<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String paramStr = reader.readLine();
            String[] pairs = paramStr.substring(paramStr.indexOf("?") + 1).split("&");
            for (String pair : pairs) {
                int idx = pair.indexOf("=");
                if(idx > 0) {
                    params.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
                }else {
                    params.put(pair, null);
                }
            }

            for(Map.Entry<String, String> entry : params.entrySet()) {
                System.out.print(entry.getKey() + " ");
            }
            System.out.println();

            for(Map.Entry<String, String> entry : params.entrySet()) {
                if(entry.getKey().equals("obj")) {
                    try {
                        alert(Double.parseDouble(entry.getValue()));
                    }catch(NumberFormatException e) {
                        alert(entry.getValue());
                    }
                }
            }

            reader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
