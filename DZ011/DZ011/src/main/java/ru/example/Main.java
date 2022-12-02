//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package ru.example;


import java.util.Collections;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            num.add(i, i + 1);
        }
        System.out.println(num);
        Collections.reverse(num); // Коллекция наоборот
        System.out.println(num);


    }
}