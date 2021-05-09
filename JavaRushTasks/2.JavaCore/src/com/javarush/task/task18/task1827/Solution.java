package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            return;
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        if(args[0].equals("-c")) {
            String productName = String.format("%-30s", args[1]);
            String price = String.format("%-8s", args[2]);
            String quantity = String.format("%-4s", args[3]);

            List<String> strFromFile = new ArrayList<>();
            bufferedReader = new BufferedReader(new FileReader(fileName));
            int max = Integer.MIN_VALUE;

            while(bufferedReader.ready()) {
                String str = bufferedReader.readLine();
                strFromFile.add(str);
                int id = Integer.parseInt(str.substring(0, 8).trim());
                max = Math.max(max, id);
            }
            bufferedReader.close();

            if(strFromFile.isEmpty()) {
                max = 0;
            }

            String output = String.format("%-8s", (max + 1)) + productName + price + quantity;

            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write("\n" + output);
            fileWriter.close();
        }
    }
}
