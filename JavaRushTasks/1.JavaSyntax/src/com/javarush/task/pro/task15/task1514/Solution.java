package com.javarush.task.pro.task15.task1514;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Все относительно
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        //напишите тут ваш код
        Path firstPath = Path.of(str1);
        Path secondPath = Path.of(str2);

        try {
            Path relativePath = firstPath.relativize(secondPath);
            System.out.println(relativePath);
        }catch(IllegalArgumentException e) {
            try {
                Path relativePath = secondPath.relativize(firstPath);
                System.out.println(relativePath);
            }catch(IllegalArgumentException e1) {

            }
        }

    }
}

