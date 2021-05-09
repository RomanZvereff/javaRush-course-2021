package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        FileOutputStream outputStream2 = null;
        String firstFile = null;
        String secondFile = null;
        String thirdFile = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            firstFile = reader.readLine();
            secondFile = reader.readLine();
            thirdFile = reader.readLine();

            reader.close();

            inputStream = new FileInputStream(firstFile);

            byte[] buffer = new byte[inputStream.available()];
            outputStream = new FileOutputStream(secondFile);
            outputStream2 = new FileOutputStream(thirdFile);

            while(inputStream.available() > 0) {
                int input = 0;
                if(buffer.length % 2 == 0) {
                    input = inputStream.read(buffer);
                    outputStream.write(buffer, 0, input / 2);
                    outputStream2.write(buffer, input / 2, input / 2);
                }else {
                    input = inputStream.read(buffer);
                    outputStream.write(buffer, 0, (input / 2) + 1);
                    outputStream2.write(buffer, (input / 2) + 1, input / 2);
                }
            }

            inputStream.close();
            outputStream.close();
            outputStream2.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
