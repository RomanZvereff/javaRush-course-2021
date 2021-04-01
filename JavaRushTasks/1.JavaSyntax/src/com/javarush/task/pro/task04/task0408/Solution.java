package com.javarush.task.pro.task04.task0408;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList();
        int max = Integer.MIN_VALUE;
        while(scanner.hasNextInt()) {
            int i = scanner.nextInt();
            numList.add(i);
        }

        if(numList.isEmpty()) {
            System.out.println(max);
        }

        if(!numList.isEmpty()) {
            boolean hasEven = false;
            for(int i : numList) {
                if(i % 2 == 0) {
                    hasEven = true;
                    max = (max > i) ? max : i;
                }
            }
            System.out.println(max);
        }
    }
}

/* JavaRush solution
public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}  */