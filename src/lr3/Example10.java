package lr3;

import java.util.*;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] numbers = new int[size];
        Random rnd = new Random();
        int i;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
            System.out.println("Элемент массива [" + i + "] равен " + numbers[i]);
        }
        for (i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[j+1]) {
                    int x = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j + 1] = x;
                }
            }
        }
        System.out.println();
        System.out.println("Сортировка по убыванию:");
        for (i = 0; i < numbers.length; i++) {
            System.out.println("Элемент массива [" + i + "] равен " + numbers[i]);
        }

    /* 10. Напишите программу, в которой создается целочисленный массив, заполняется случайными
    числами и после этого значения элементов в массиве сортируются в порядке убывания значений.
     */
    }
}
