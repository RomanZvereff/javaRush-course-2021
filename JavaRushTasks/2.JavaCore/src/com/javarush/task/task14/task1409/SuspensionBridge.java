package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {
    public static final int CARS_COUNT = 10;

    @Override
    public int getCarsCount() {
        return CARS_COUNT;
    }
}
