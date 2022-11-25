//Вывести все простые числа от 1 до 1000

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int val = 1000;
        for (int j = 1; j <= val; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }


}