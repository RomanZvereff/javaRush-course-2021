package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        try {
            while(!(fileName = bufferedReader.readLine()).equals("exit")) {
                ReadThread readThread = new ReadThread(fileName);
                readThread.start();
            }
            bufferedReader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }

    public static class ReadThread extends Thread {
        private Map<Integer, Integer> pairs;

        private String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            try {
                readFile(fileName);
                getMaxByte(pairs);
            }catch(IOException e) {
                e.printStackTrace();
            }

        }

        private void readFile(String fileName) throws IOException {
            FileInputStream inputStream = new FileInputStream(fileName);
            pairs = new HashMap<>();
            while(inputStream.available() > 0) {
                Integer inputByte = inputStream.read();
                Integer count = (pairs.containsKey(inputByte) ? pairs.get(inputByte) : 0);
                pairs.put(inputByte, ++count);
            }
            inputStream.close();
        }

        private void getMaxByte(Map<Integer, Integer> map) {
            int max = Collections.max(map.values());

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue().equals(max)) {
                    resultMap.put(fileName, entry.getKey());
                }
            }
        }
    }
}
