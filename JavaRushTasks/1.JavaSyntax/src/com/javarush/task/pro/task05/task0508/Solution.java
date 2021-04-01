package com.javarush.task.pro.task05.task0508;

import java.util.Arrays;
import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[10];

        for(int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        for(int i = 0; i < strings.length; i++) {
            if(strings[i] == null) break;
            String item = strings[i];
            for(int j = i + 1; j < strings.length; j++) {
                if(item.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        Arrays.stream(strings).forEach(System.out::println);
    }
}
