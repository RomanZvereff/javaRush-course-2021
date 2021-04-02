package com.javarush.task.pro.task09.task0907;

/*
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        if(decimalNumber <= 0) {
            return "";
        }

        String hex = "";
        while(decimalNumber != 0) {
            int index = (decimalNumber % 16);
            hex = HEX.substring(index, index + 1) + hex;
            decimalNumber = decimalNumber / 16;
        }
        return hex;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        if(hexNumber == null || hexNumber.equals("")) {
            return 0;
        }

        int decimal = 0;
        for(int i = 0; i < hexNumber.length(); i++) {
            int index = HEX.indexOf(hexNumber.substring(i, i + 1));
            decimal = 16 * decimal + index;
        }
        return decimal;
    }
}
