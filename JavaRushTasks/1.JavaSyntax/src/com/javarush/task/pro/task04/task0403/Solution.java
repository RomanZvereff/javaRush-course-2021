package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String inputData = null;
        double sumNum = 0;

        while(true) {
            inputData = scanner.nextLine();
            if(inputData.equals("ENTER")) {
                System.out.println(sumNum);
                break;
            }else {
                sumNum += Double.parseDouble(inputData);
            }
        }

    }
}