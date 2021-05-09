package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    private Map<Integer, String> files = new HashMap<>();
    public static void main(String[] args) {
        Map<Integer, String> filesMap;
        Solution solution = new Solution();
        try {
            filesMap = solution.readFileName();
            solution.sort(filesMap);
            solution.writeToFile(filesMap);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Integer, String> readFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        while(!(name = reader.readLine()).equals("end")) {
            String tempStr = (name.substring(name.lastIndexOf(".") + 1).replaceAll("[^0-9]", ""));
            int partIndex = Integer.parseInt(tempStr);
            files.put(partIndex, name);
        }
        return files;
    }

    public void sort(Map<Integer, String> map) {
        TreeMap<Integer, String> sortedChars = new TreeMap<>(map);
    }

    public void writeToFile(Map<Integer, String> map) throws IOException {
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            String fileName = entry.getValue();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName.substring(0, fileName.lastIndexOf(".")), true));
            int c;
            while((c = reader.read()) != -1) {
                writer.write(c);
            }
            reader.close();
            writer.close();
        }
    }

}
