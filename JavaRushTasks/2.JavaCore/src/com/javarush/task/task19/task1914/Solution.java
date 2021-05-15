package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        testString.printSomething();

        String example = byteArrayOutputStream.toString();
        String[] splitExample = example.split(" ");
        int result = 0;

        switch(splitExample[1]) {
            case("+"):
                result = Integer.parseInt(splitExample[0]) + Integer.parseInt(splitExample[2]);
                break;
            case("-"):
                result = Integer.parseInt(splitExample[0]) - Integer.parseInt(splitExample[2]);
                break;
            case("*"):
                result = Integer.parseInt(splitExample[0]) * Integer.parseInt(splitExample[2]);
                break;
        }

        System.setOut(consoleStream);

        String output = example + result;

        System.out.print(output);
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

