package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            Scanner scanner = new Scanner(System.in);
            BufferedWriter writer = new BufferedWriter(new FileWriter(scanner.nextLine()));
            String str;

            while(true) {
                str = scanner.nextLine();
                writer.write(str + "\n");
                if(str.equals("exit")) {
                    break;
                }
            }
            scanner.close();
            writer.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
