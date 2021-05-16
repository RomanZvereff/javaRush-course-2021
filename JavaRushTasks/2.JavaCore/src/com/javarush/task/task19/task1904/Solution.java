package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
        Path path = Paths.get("D:\\JAVA\\javaRush-course-2021\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1904\\file1");
        try {
            Scanner scanner = new Scanner(path);
            PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(scanner);
            personScannerAdapter.read();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] fileData = fileScanner.nextLine().split(" ");
            String lastName = fileData[0];
            String firstName = fileData[1];
            String middleName = fileData[2];
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            Person person = null;
            try {
                Date date = simpleDateFormat.parse(fileData[3] + " " + fileData[4] + " "  + fileData[5]);
                person = new Person(firstName, middleName, lastName, date);
            }catch(ParseException e) {
                e.printStackTrace();
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
