package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;
import java.util.Arrays;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        if(count % 2 == 0) {
            for(int i = (numbers.length - 1); i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        }else {
            for(int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }

    }
}
