package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.*;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(fileName));
        while(bufferedReader.ready()) {
            stringBuilder.append(bufferedReader.readLine());
        }
        bufferedReader.close();

        Document document = Jsoup.parse(stringBuilder.toString(), "", Parser.xmlParser());
        Elements elements = document.select(args[0]);
        for(Element e : elements) {
            System.out.println(e);
        }

    }
}
