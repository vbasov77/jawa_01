//
//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package ru.example;


import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        Integer[] arr = {3, 11, 16, 14, 7};
        int i = 0, n = arr.length;
        boolean swapNeeded = true;
        while (i < n - 1 && swapNeeded) {
            String str1 = Integer.toString(n);
            logger.log(Level.INFO, new String(Arrays.toString(arr)));// Перевод в строку
            swapNeeded = false;
            for (int j = 1; j < n - i; j++) {
                logger.log(Level.INFO, new String(Arrays.toString(arr)));
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapNeeded = true;
                }
            }
            if (!swapNeeded) {
                break;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }


}