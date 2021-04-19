package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        List<Integer> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(System.in);
            FileInputStream fileInputStream = new FileInputStream(scanner.nextLine());
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

            while(reader.ready()) {
                list.add(Integer.parseInt(reader.readLine()));
            }

            scanner.close();
            fileInputStream.close();
            reader.close();

            Collections.sort(list);

            for(Integer i : list) {
                if(i % 2 == 0)
                    System.out.println(i);
            }

        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
