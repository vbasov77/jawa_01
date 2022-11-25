//Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        int[] arr = IntStream.rangeClosed(1, n).toArray();
        int sum = IntStream.of(arr).sum();
        int pr = 1;
        for (int i = 0; i < arr.length; i++){
            pr *= arr[i];
        }
            System.out.println(Arrays.toString(arr));
            System.out.println(String.format("Сумма: %d", sum));
            System.out.println(String.format("Произведение: %d", pr));


    }
}