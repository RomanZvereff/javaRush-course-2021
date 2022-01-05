package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Алгоритмы-числа
*/

public class Solution {

    private static int digits;
    private static long N;
    private static long[][] powerNumbers;
    private static int[] currentNumber;
    private static int digitsCurrent;
    private static List<Long> armsNum;
    private static long minCurrent;
    private static long maxCurrent;

    public static long[] getNumbers(long N) {
        digits = howManyDigits(N);
        Solution.N = N - 1;
        powerNumbers = getArrayPowerNumbers(digits);
        digitsCurrent = 0;
        armsNum = new ArrayList<>();
        while (++digitsCurrent <= digits) {
            findTheNumbers();
        }

        Collections.sort(armsNum);
        return getArray(armsNum);
    }

    private static int howManyDigits(long N) {
        long p = 10;
        for (int i = 1; i < 19; i++) {
            if (N < p) return i;
            p *= 10;
        }
        return 19;
    }

    private static long[][] getArrayPowerNumbers(int pow) {
        long[][] powerNumbers = new long[10][pow + 1];
        for (int i = 0; i < 10; i++) {
            long p = 1;
            for (int j = 0; j < pow + 1; j++) {
                powerNumbers[i][j] = p;
                p *= i;
            }
        }
        return powerNumbers;
    }

    private static void findTheNumbers() {
        maxCurrent = digitsCurrent == digits ? N : getCurrentMax(digitsCurrent);
        minCurrent = getCurrentMin(digitsCurrent);
        currentNumber = new int[digitsCurrent];
        recursion(0);
    }

    private static long getCurrentMax(int digits) {
        String number9 = "999999999999999999";

        if (digits < 19)
            return Long.parseLong(number9.substring(18 - digits));

        return Long.MAX_VALUE; // Max Long = 9223372036854775807
    }

    private static long getCurrentMin(int digits) {
        String number9 = "1000000000000000000";
        return Long.parseLong(number9.substring(0, digits));
    }

    private static void recursion(int index) {
        if (index + 1 == digitsCurrent) {
            int i = (index < 1) ? 0 : currentNumber[index - 1];
            while (i < 10) {
                currentNumber[index] = i++;
                long newNumber = 0;
                for (int digit : currentNumber) newNumber += powerNumbers[digit][digitsCurrent];
                if (newNumber > maxCurrent || newNumber < 0) return;
                if (newNumber < minCurrent) continue;
                if (Arrays.equals(getNumbersMap(currentNumber), getNumbersMap(getDigits(newNumber, digitsCurrent))))
                    armsNum.add(newNumber);
            }
        } else if (index > 0) {

            int i = currentNumber[index - 1];

            while (i < 10) {
                currentNumber[index] = i++;
                recursion(index + 1);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                currentNumber[0] = i;
                recursion(index + 1);
            }
        }
    }

    private static int[] getNumbersMap(int[] number) {
        int[] numbersMap = new int[10];
        for (int i : number) numbersMap[i]++;
        return numbersMap;
    }

    private static int[] getDigits(long number, int digits) {
        int[] result = new int[digits];
        int i = 0;
        while(number > 0){
            result[i++] = (int) (number %   10);
            number /= 10;
        }
        return result;
    }

    private static long[] getArray(List<Long> longs) {
        long[] result = new long[longs.size()];
        for (int i = 0; i < longs.size(); i++) {
            result[i] = longs.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(371)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}
