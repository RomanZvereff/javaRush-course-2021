package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            List<String> firstList = readFile(bufferedReader.readLine());
            List<String> secondList = readFile(bufferedReader.readLine());
            compareLists(firstList, secondList);
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return "LineItem{" +
                    "type=" + type +
                    ", line='" + line + '\'' +
                    '}';
        }
    }

    public static List<String> readFile(String fileName) {
        List<String> list = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while(bufferedReader.ready()) {
                list.add(bufferedReader.readLine());
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    public static void compareLists(List<String> firstList, List<String> secondList) {
        int counter = 0;

        while(firstList.size() != 0 || secondList.size() != 0) {
            if(firstList.size() == 1 && secondList.size() > 1) {
                if(firstList.get(counter).equals(secondList.get(counter))) {
                    lines.add(new LineItem(Type.SAME, firstList.get(counter)));
                    firstList.remove(counter);
                    secondList.remove(counter);
                    lines.add(new LineItem(Type.ADDED, secondList.get(counter)));
                }else {
                    lines.add(new LineItem(Type.SAME, firstList.get(counter)));
                    lines.add(new LineItem(Type.ADDED, secondList.get(counter)));
                    firstList.remove(counter);
                    break;
                }
            } else if(firstList.size() > 1 && secondList.size() == 1) {
                if(firstList.get(counter).equals(secondList.get(counter))) {
                    lines.add(new LineItem(Type.SAME, firstList.get(counter)));
                    firstList.remove(counter);
                    secondList.remove(counter);
                    lines.add(new LineItem(Type.ADDED, firstList.get(counter)));
                }else {
                    lines.add(new LineItem(Type.REMOVED, firstList.get(counter)));
                    lines.add(new LineItem(Type.SAME, secondList.get(counter)));
                    secondList.remove(counter);
                    break;
                }
            }

            if(firstList.get(counter).equals(secondList.get(counter))) {
                lines.add(new LineItem(Type.SAME, firstList.get(counter)));
                firstList.remove(counter);
                secondList.remove(counter);
            }else if(!firstList.get(counter).equals(secondList.get(counter + 1))) {
                lines.add(new LineItem(Type.REMOVED, firstList.get(counter)));
                firstList.remove(counter);
            }else if(firstList.get(counter).equals(secondList.get(counter + 1))) {
                lines.add(new LineItem(Type.ADDED, secondList.get(counter)));
                secondList.remove(counter);
            }

        }
    }

}
