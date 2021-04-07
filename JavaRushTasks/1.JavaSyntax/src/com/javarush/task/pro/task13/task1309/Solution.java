package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Bob Black", 4.85);
        grades.put("Bob White", 4.78);
        grades.put("Bill Murray", 4.99);
        grades.put("Sarah Oconor", 4.23);
        grades.put("Nick Black", 4.4);
    }
}
