package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Деление целых чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int bottle = scanner.nextInt();
        int people = scanner.nextInt();

        System.out.println((double)bottle / people);
    }
}