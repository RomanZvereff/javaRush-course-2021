package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код
        String cityName = city.getName();
        int cityTemperature = city.getTemperature();
        System.out.println("В городе " + cityName + " сегодня температура воздуха "
                                + cityTemperature);
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        City amsterdam = new City("Амстердам", 25);
        showWeather(amsterdam);
    }
}
