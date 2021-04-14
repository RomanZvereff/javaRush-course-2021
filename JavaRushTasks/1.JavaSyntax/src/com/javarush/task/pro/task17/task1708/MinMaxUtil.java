package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int i, int j) {
        return Math.min(i, j);
    }

    public static int min(int i, int j, int k) {
        return Math.min(Math.min(i, j), k);
    }

    public static int min(int i, int j, int k, int n) {
        return Math.min(Math.min(Math.min(i, j), k), n);
    }

    public static int min(int i, int j, int k, int n, int m) {
        return Math.min(Math.min(Math.min(Math.min(i, j), k), n), m);
    }

    public static int max(int i, int j) {
        return Math.max(i, j);
    }

    public static int max(int i, int j, int k) {
        return Math.max(Math.max(i, j), k);
    }

    public static int max(int i, int j, int k, int n) {
        return Math.max(Math.max(Math.max(i, j), k), n);
    }

    public static int max(int i, int j, int k, int n, int m) {
        return Math.max(Math.max(Math.max(Math.max(i, j), k), n), m);
    }
}
