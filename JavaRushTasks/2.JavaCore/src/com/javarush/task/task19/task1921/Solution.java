package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd M yyyy");

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            int digitIndex = -1;
            while(reader.ready()) {
                String input = reader.readLine();
                for(int i = 0; i < input.length(); i++) {
                    if(Character.isDigit(input.charAt(i))) {
                        digitIndex = i;
                        break;
                    }
                }
                PEOPLE.add(new Person(input.substring(0, digitIndex - 1), formatter.parse(input.substring(digitIndex))));
            }
        }catch(IOException | ParseException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
