package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/* 
Получение информации по API
*/

public class Solution {
    public static final int DEFAULT_BUFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишите тут ваш код
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        OutputStream output = connection.getOutputStream();
        output.write(1);

        InputStream inputStream = connection.getInputStream();
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

