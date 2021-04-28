package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    /**
     * положительное число, если первый пляж лучше
     * отрицательное число, если второй пляж лучше
     * ноль, если пляжи одинаковые
      * @param o - второй пляж
     */
    @Override
    public synchronized int compareTo(Beach o) {
        return Integer.compare(this.getQuality(), o.getQuality()) + ((-1) * Float.compare(this.getDistance(), o.getDistance()));
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }
}
