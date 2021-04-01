package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if(x == y && y == z) {
            System.out.println(x + " " + y + " " + z);
        }else if(x == y) {
            System.out.println(x + " " + y);
        }else if(y == z) {
            System.out.println(y + " " + z);
        }else if(x == z) {
            System.out.println(x + " " + z);
        }

    }
}
