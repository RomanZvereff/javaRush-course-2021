package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь окружности
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = 3.14;

        if(radius >= 0) {
            System.out.println((int)(pi * radius * radius));
        }

    }
}