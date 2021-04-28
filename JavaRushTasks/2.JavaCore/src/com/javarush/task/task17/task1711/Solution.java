package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat inputFormat = new SimpleDateFormat("d/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("d-MMM-yyyy", Locale.ENGLISH);

        switch(args[0]) {
            case "-c":
                synchronized(allPeople) {
                    for(int i = 1; i < args.length - 2; i += 3) {
                        Date bDate = inputFormat.parse(args[i + 2]);
                        Person person = (args[i + 1].equals("м") ? Person.createMale(args[i], bDate) : Person.createFemale(args[i], bDate));
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                    break;
                }
            case "-u":
                synchronized(allPeople) {
                    for(int i = 1; i < args.length - 2; i += 4) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(args[i + 1]);
                        person.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                        person.setBirthDate(inputFormat.parse(args[i + 3]));
                    }
                    break;
                }
            case "-d":
                synchronized(allPeople) {
                    for(int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                    break;
                }
            case "-i":
                synchronized(allPeople) {
                    for(int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        String sex = ((person.getSex() == Sex.MALE) ? "м" : "ж");
                        String input = person.getName() + " " + sex + " " + outputFormat.format(person.getBirthDate());
                        System.out.println(input);
                    }
                    break;
                }

        }
    }
}
