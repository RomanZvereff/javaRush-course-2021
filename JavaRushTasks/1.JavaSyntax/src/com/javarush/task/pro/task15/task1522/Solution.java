package com.javarush.task.pro.task15.task1522;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* 
Получение информации по API
*/

public class Solution {

    public static final int DEFAULT_BUFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        //напишите тут ваш код
        InputStream inputStream = url.openStream();

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        String apiStr = result.toString(StandardCharsets.UTF_8.name());

        System.out.println(apiStr);
    }
}