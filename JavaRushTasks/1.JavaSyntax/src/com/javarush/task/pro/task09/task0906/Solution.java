package com.javarush.task.pro.task09.task0906;

/*
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишите тут ваш код
        String binary = "";
        if(decimalNumber <= 0)
            return "";
        while(decimalNumber != 0) {
            binary = (decimalNumber % 2) + binary;
            decimalNumber /= 2;
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        //напишите тут ваш код
        if(binaryNumber == null || binaryNumber.equals(""))
            return 0;

        int decimal = 0;
        int[] binaryArray = new int[binaryNumber.length()];

        for(int i = binaryNumber.length() - 1, j = 0; i >= 0 ; i--, j++) {
            binaryArray[j] = binaryNumber.charAt(i) - '0';
        }

        for(int i = 0; i < binaryArray.length; i++) {
            decimal = (int)(decimal + binaryArray[i] * Math.pow(2, i));
        }
        return decimal;
    }
}
