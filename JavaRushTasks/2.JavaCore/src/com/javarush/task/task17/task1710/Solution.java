package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);

        if(args[0].equals("-c")) {
            Date bDate = inputFormat.parse(args[3]);
            Person person = (args[2].equals("м") ? Person.createMale(args[1], bDate) : Person.createFemale(args[1], bDate));
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }

        if(args[0].equals("-u")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
            person.setBirthDate(inputFormat.parse(args[4]));
        }

        if(args[0].equals("-d")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

        if(args[0].equals("-i")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String sex = ((person.getSex() == Sex.MALE) ? "м" : "ж");
            String input = person.getName() + " " + sex + " " + outputFormat.format(person.getBirthDate());
            System.out.println(input);
        }

    }
}
