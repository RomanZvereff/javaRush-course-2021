package com.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/* 
Простой шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy" + "г. " + "H" + "ч." + "m" + "мин");
        String dateTimeStr = formatter.format(localDateTime);
        System.out.println(dateTimeStr);
    }
}
