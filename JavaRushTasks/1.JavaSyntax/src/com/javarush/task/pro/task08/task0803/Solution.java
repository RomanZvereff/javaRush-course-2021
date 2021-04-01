package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int min = Integer.MAX_VALUE;
        for(int anInt : ints) {
            min = Math.min(anInt, min);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        return nums;
    }
}
