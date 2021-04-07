package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишите тут ваш код
    public static Month[] getWinterMonths() {
        Month[] winterMonths = {Month.DECEMBER, Month.JANUARY, Month.FEBRUARY};
        return winterMonths;
    }

    public static Month[] getSpringMonths() {
        Month[] springMonths = {Month.MARCH, Month.APRIL, Month.MAY};
        return springMonths;
    }

    public static Month[] getSummerMonths() {
        Month[] summerMonths = {Month.JUNE, Month.JULY, Month.AUGUST};
        return summerMonths;
    }

    public static Month[] getAutumnMonths() {
        Month[] autumnMonths = {Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER};
        return autumnMonths;
    }

}
