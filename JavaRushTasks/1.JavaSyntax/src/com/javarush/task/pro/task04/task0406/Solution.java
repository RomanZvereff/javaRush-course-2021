package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str;
        while(true) {
            str = scanner.nextLine();
            if(!str.equals("enough")) {
                System.out.println(str);
            }else {
                break;
            }
        }
    }
}