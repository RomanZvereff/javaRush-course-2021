package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution solution = new Solution();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String firstFile = reader.readLine();
            String secondFile = reader.readLine();

            reader = new BufferedReader(new FileReader(firstFile));
            while(reader.ready()) {
                allLines.add(reader.readLine());
            }

            reader = new BufferedReader(new FileReader(secondFile));
            while(reader.ready()) {
                forRemoveLines.add(reader.readLine());
            }

            reader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

        try {
            solution.joinData();
        }catch(CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
