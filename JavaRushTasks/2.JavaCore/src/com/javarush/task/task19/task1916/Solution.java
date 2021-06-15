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
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstFile = bufferedReader.readLine();
            String secondFile = bufferedReader.readLine();
            bufferedReader.close();

            List<String> list1 = new ArrayList<>(readFile(firstFile));
            List<String> list2 = new ArrayList<>(readFile(secondFile));

            int i1 = 0, i2 = 0;

            while(i1 < list1.size() && i2 < list2.size()) {
                if(list1.get(i1).equals(list2.get(i2))) {
                    lines.add(new LineItem(Type.SAME, list1.get(i1)));
                    i1++;
                    i2++;
                }else if(list1.get(i1).equals(list2.get(i2 + 1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(i2)));
                    i1++;
                }else {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i1)));
                    i2++;
                }
            }

            for(LineItem item : lines) {
                System.out.println(item.toString());
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static enum Type {
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
            return type + " " + line;
        }
    }

    public static List<String> readFile(String fileName) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while(fileReader.ready()) {
            list.add(fileReader.readLine());
        }
        return list;
    }
}
