package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        array = new int[length];
        int min = (length > 0) ? Integer.MAX_VALUE : 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if(array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}
