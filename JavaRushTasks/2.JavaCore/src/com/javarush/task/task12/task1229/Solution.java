package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Chief implements Businessman {

    }

    public static class Chief implements Businessman {
        @Override
        public void workHard() {

        }
    }
}
