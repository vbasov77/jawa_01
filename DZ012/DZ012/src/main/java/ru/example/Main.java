//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

package ru.example;

import java.util.LinkedList;

public class Main {

    public static LinkedList<Integer> enqueue(LinkedList<Integer> arr, Integer el) {
        arr.add(arr.size(), el);
        return arr;
    }

    public static int dequeue(LinkedList<Integer> arr) {
        // возвращает первый элемент из очереди и удаляет его
        int el = arr.get(0);
        arr.remove(0);

        System.out.println("удалили из списка");
        System.out.println(arr);
        return el;
    }

    public static int first(LinkedList<Integer> arr) {
        // возвращает первый элемент из очереди, не удаляя.
        int el = arr.get(0);
        return el;
    }

    public static void main(String[] args) {

        LinkedList<Integer> num = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            num.add(i, i + 1);
        }
        // Сам список
        System.out.println("Сам список");
        System.out.println(num);

        // Поместит элемент в конце списка
        int el = 10;
        System.out.println("Добавили элемент в конце");
        System.out.println(enqueue(num, el));

        // Вывели первый элемент
        System.out.println("Вывели первый элемент и");
        System.out.println(dequeue(num));

        System.out.println("Вывели первый элемент");
        System.out.println(first(num));
        System.out.println("Не удаляя из списка");
        System.out.println(num);



    }
}