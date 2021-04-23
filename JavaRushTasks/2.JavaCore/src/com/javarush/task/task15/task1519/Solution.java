package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                String inputString = reader.readLine();
                if(inputString.equals("exit")) {
                    break;
                }
                try {
                    if(inputString.contains(".")) {
                        print(Double.parseDouble(inputString));
                    }else if(Integer.parseInt(inputString) <= 0 || Integer.parseInt(inputString) >= 128) {
                        print(Integer.parseInt(inputString));
                    }else if(Short.parseShort(inputString) > 0 && Short.parseShort(inputString) < 128) {
                        print(Short.parseShort(inputString));
                    }
                }catch(NumberFormatException e) {
                    print(inputString);
                }
            }
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }finally {
            if(reader != null) {
                reader.close();
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
