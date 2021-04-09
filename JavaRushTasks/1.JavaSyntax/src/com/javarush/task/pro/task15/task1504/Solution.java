package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            scanner = new Scanner(System.in);
            String pathFile1 = scanner.nextLine();
            String pathFile2 = scanner.nextLine();

            inputStream = Files.newInputStream(Paths.get(pathFile1));
            outputStream = Files.newOutputStream(Paths.get(pathFile2));

            byte[] buffer = new byte[2]; // 2b

            while(inputStream.available() > 0) {
                int real = inputStream.read(buffer);
                if(real == 2) {
                    outputStream.write(buffer[1]);
                    outputStream.write(buffer[0]);
                }else {
                    outputStream.write(buffer[0]);
                }
            }
        }catch(IOException e) {
            System.out.println("Ooooops!");
        }finally {
            if(inputStream != null) {
                inputStream.close();
            }
            if(outputStream != null) {
                outputStream.close();
            }
            if(scanner != null) {
                scanner.close();
            }
        }

    }
}

