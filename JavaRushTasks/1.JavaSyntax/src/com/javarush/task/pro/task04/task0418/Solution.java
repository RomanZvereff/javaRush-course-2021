package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean flag = scanner.nextBoolean();

        int result = (flag) ? (int)Math.ceil(0.5) : (int)Math.floor(0.5);

        System.out.println(result);
    }
}