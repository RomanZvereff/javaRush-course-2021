package com.javarush.task.pro.task09.task0915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        ArrayList<String> tokenList = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);

        while(stringTokenizer.hasMoreTokens()) {
            tokenList.add(stringTokenizer.nextToken());
        }

        String[] strArray = new String[tokenList.size()];

        for(int i = 0; i < tokenList.size(); i++) {
            strArray[i] = tokenList.get(i);
        }
        return strArray;
    }
}
