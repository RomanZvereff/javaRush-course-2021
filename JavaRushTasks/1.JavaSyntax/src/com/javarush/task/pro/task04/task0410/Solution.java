package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int firstMin = Math.min(i, j);
        int secondMin = Math.max(i,j);

        while(scanner.hasNextInt()) {
            int k = scanner.nextInt();
            int min = Math.min(firstMin, k);
            if(min < firstMin) {
                secondMin = firstMin;
                firstMin = min;
            }
            if(((secondMin > k) && (firstMin < k)) || (secondMin == firstMin)) {
                secondMin = k;
            }
        }
        System.out.print(secondMin);
    }
}