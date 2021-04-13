package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1990, Calendar.DECEMBER, 16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишите тут ваш код
        String dayNameRu = null;
        switch(calendar.get(Calendar.DAY_OF_WEEK)) {
            case(1):
                dayNameRu = "Воскресенье";
                break;
            case(2):
                dayNameRu = "Понедельник";
                break;
            case(3):
                dayNameRu = "Вторник";
                break;
            case(4):
                dayNameRu = "Среда";
                break;
            case(5):
                dayNameRu = "Четверг";
                break;
            case(6):
                dayNameRu = "Пятница";
                break;
            case(7):
                dayNameRu = "Суббота";
                break;
        }
        return dayNameRu;
    }
}
