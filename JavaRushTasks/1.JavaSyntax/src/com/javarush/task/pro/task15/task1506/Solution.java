package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));

            for(String str : list) {
                System.out.println(str.replaceAll("[., ]", ""));
            }

        }catch(IOException e) {
            System.out.println("Oooops!");
        }finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }
}

