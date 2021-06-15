package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(byteArrayOutputStream);
        System.setOut(myStream);

        testString.printSomething();

        System.setOut(consoleStream);

        String[] str = byteArrayOutputStream.toString().split("\\n");
        int counter = 0;
        for(int i = 0; i < str.length; i++) {
            if(counter > 0 && counter % 2 == 0){
                System.out.println("JavaRush - курсы Java онлайн");
            }
            System.out.println(str[i]);
            counter++;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
