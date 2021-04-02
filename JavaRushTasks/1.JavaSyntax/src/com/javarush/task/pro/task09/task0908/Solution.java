package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

import java.util.Arrays;

public class Solution {

    public static final String[] binArray = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
    public static final String[] hexArray = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f",};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        if(binaryNumber == null || binaryNumber.equals("")) {
            return "";
        }

        for(int i = 0; i < binaryNumber.length(); i++) {
            int num = binaryNumber.charAt(i) - '0';
            if(num < 0 || num > 1) {
                return "";
            }
        }

        int neededLength = (int)Math.ceil(binaryNumber.length() / 4.0) * 4;
        int addBits = neededLength - binaryNumber.length();

        for(int i = 0; i < addBits; i++) {
            binaryNumber = "0" + binaryNumber;
        }

        for(int i = 0; i < (binaryNumber.length() / 4); i++) {
            int indexBinary = i * 4;
            String fourBits = binaryNumber.substring(indexBinary, indexBinary + 4);
            int indexHex = Arrays.asList(binArray).indexOf(fourBits);
            hexNumber = hexNumber + hexArray[indexHex];
        }

        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        String binaryNumber = "";
        if(hexNumber == null || hexNumber.equals("")) {
            return "";
        }

        if(!hexNumber.matches("^[a-f0-9]+$")) {
            return "";
        }

        for(int i = 0; i < hexNumber.length(); i++) {
            int indexHex = Arrays.asList(hexArray).indexOf(hexNumber.substring(i, i + 1));
            binaryNumber = binaryNumber + binArray[indexHex];
        }

        return binaryNumber;
    }
}
