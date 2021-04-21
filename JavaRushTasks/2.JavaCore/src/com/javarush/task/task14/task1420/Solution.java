package com.javarush.task.task14.task1420;

import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        if(firstNum <= 0 || secondNum <= 0) {
            throw new IllegalArgumentException();
        }

        while(secondNum != 0) {
            int temp = firstNum % secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }

        System.out.println(firstNum);
    }
}
