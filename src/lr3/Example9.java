package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] numbers = new int[size];
        System.out.println("Перед сортировкой:");
        Random rnd = new Random();
        int i;
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
            System.out.println("Элемент массива [" + i + "] равен " + numbers[i]);
        }
        System.out.println();
        System.out.println("После сортировки:");
        Arrays.sort(numbers);
        for (i = 0; i < numbers.length; i++) {
            System.out.println("Элемент массива [" + i + "] равен " + numbers[i]);
        }

    /* 9. Напишите программу, в которой создается массив и заполняется случайными числами.
    Массив отображается в консольном окне. В этом массиве необходимо определить элемент с
    минимальным значением. В частности, программа должна вывести значение элемента с минимальным
    значением и индекс этого элемента. Если элементов с минимальным значением несколько, должны
    быть выведены индексы всех этих элементов.
     */



    }
}
