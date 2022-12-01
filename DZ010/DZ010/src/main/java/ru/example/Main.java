//Задан целочисленный список ArrayList.
//Найти минимальное, максимальное и среднее арифметическое этого списка.

package ru.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        for (Integer i: list) {
            sum = sum + i;
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }
        sum = sum / list.size();
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("среднее арифметическое: " + sum);
    }
}