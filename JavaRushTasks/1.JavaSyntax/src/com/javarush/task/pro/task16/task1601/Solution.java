package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник:)
*/

public class Solution {

    static Date birthDate = new Date(90, 11, 16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //напишите тут ваш код
        String dayName = null;
        switch(date.getDay()) {
            case(0):
                dayName = "Воскресенье";
                break;
            case(1):
                dayName = "Понедельник";
                break;
            case(2):
                dayName = "Вторник";
                break;
            case(3):
                dayName = "Среда";
                break;
            case(4):
                dayName = "Четверг";
                break;
            case(5):
                dayName = "Пятница";
                break;
            case(6):
                dayName = "Суббота";
                break;
        }

        return dayName;
    }
}
