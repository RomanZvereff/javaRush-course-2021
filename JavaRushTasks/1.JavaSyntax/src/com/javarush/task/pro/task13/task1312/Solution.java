package com.javarush.task.pro.task13.task1312;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* 
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        HashMap<Integer, String> languagesMap = new HashMap<>();

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        for(int i = 0; i < programmingLanguages.size(); i++) {
            String value = programmingLanguages.get(i);
            languagesMap.put(i, value);
        }

        return languagesMap;
    }

}
