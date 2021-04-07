package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишите тут ваш код
        Node newNode = new Node();

        if(first.next == null && last.prev == null) {
            first.next = last.prev = newNode;
            newNode.prev = first;
            newNode.next = last;
            newNode.value = value;
        }else {
            last.prev.next = newNode;
            newNode.value = value;
            newNode.next = last;
            newNode.prev = last.prev;
            last.prev = newNode;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
