package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) {
        if(args.length == 0) {
            return;
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = bufferedReader.readLine();
            bufferedReader.close();

            if(args[0].equals("-u")) {
                Integer id = Integer.parseInt(args[1]);
                String productName = String.format("%-30s", args[2]);
                String price = String.format("%-8s", args[3]);
                String quantity = String.format("%-4s", args[4]);

                List<String> strFileList = new ArrayList<>();
                bufferedReader = new BufferedReader(new FileReader(fileName));
                while(bufferedReader.ready()) {
                    strFileList.add(bufferedReader.readLine());
                }
                bufferedReader.close();

                for(int i = 0; i < strFileList.size(); i++) {
                    Integer idFromList = Integer.parseInt(strFileList.get(i).substring(0, 8).trim());
                    if(idFromList.equals(id)) {
                        String newData = String.format("%-8s", id) + productName + price + quantity;
                        strFileList.set(i, newData);
                    }
                }

                new FileWriter(fileName, false).close();
                FileWriter fileWriter = new FileWriter(fileName, true);
                for(String s : strFileList) {
                    fileWriter.write(s + "\n");
                }

                fileWriter.close();
            }

            if(args[0].equals("-d")) {
                Integer id = Integer.parseInt(args[1]);
                List<String> strFileList = new ArrayList<>();
                bufferedReader = new BufferedReader(new FileReader(fileName));
                while(bufferedReader.ready()) {
                    strFileList.add(bufferedReader.readLine());
                }
                bufferedReader.close();

                Iterator<String> iterator = strFileList.iterator();
                while(iterator.hasNext()) {
                    String listStr = iterator.next();
                    Integer idFromList = Integer.parseInt(listStr.substring(0, 8).trim());
                    if(idFromList.equals(id)) {
                        iterator.remove();
                    }
                }

                new FileWriter(fileName, false).close();
                FileWriter fileWriter = new FileWriter(fileName, true);
                for(String s : strFileList) {
                    fileWriter.write(s + "\n");
                }

                fileWriter.close();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
