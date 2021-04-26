package com.javarush.task.task16.task1632;

import java.util.Scanner;

public class FifthThread extends Thread {
    private static volatile Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        int sum = 0;

        try {
            while(true) {
                String input = scanner.nextLine();
                if(input.equals("N")) {
                    System.out.println(sum);
                    break;
                }else {
                    sum += Integer.parseInt(input);
                }
            }
        }catch(NumberFormatException e) {
            System.out.println(sum);
        }
    }
}
