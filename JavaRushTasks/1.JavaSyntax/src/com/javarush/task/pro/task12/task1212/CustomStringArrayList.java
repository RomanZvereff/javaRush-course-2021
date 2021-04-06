package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        int newCapacity = (int)(capacity * 1.5);
        String[] newElements = new String[newCapacity];

        for(int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }

        capacity = newCapacity;
        elements = newElements;
    }

}
