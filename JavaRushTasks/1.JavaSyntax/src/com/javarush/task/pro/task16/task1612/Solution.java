package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        Set<LocalDateTime> localDateTimeSet = new HashSet<>();
        LocalDate localDate;
        LocalTime localTime;

        for(Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) {
            localDate = entry.getKey();
            for(LocalTime time : entry.getValue()) {
                localTime = time;
                localDateTimeSet.add(LocalDateTime.of(localDate, localTime));
            }
        }
        return localDateTimeSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}