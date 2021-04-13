package com.javarush.task.pro.task16.task1613;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
Фильтруем выходные
*/

public class Solution {

    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        //напишите тут ваш код
        boolean isWeekend = false;
        int dayNum = dateTime.getDayOfWeek().getValue();
        int dayHour = dateTime.getHour();

        if(dayNum == FRIDAY && dayHour >= WEEKEND_START_FRIDAY_CUT_OFF_HOUR) {
            isWeekend = true;
        }else if(dayNum == SATURDAY) {
            isWeekend = true;
        }else if(dayNum == SUNDAY && dayHour < WEEKEND_END_SUNDAY_CUT_OFF_HOUR) {
            isWeekend = true;
        }
        return isWeekend;
    }
}
