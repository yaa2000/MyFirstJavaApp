package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] fibonachiArray = new int[size];
        System.out.println("Здесь используется цикл for");
        fibonachiArray[0] = 1;
        fibonachiArray[1] = 1;
        System.out.println(fibonachiArray[0]);
        System.out.println(fibonachiArray[1]);
        for (int i = 2; i < fibonachiArray.length; i++) {
            fibonachiArray[i] = fibonachiArray[i-2] + fibonachiArray[i-1];
            System.out.println(fibonachiArray[i]);
        }
        System.out.println("А это с циклом while");

        System.out.println(fibonachiArray[0]);
        System.out.println(fibonachiArray[1]);
        int j = 2;
        while (j < fibonachiArray.length) {
            fibonachiArray[j] = fibonachiArray[j-2] + fibonachiArray[j-1];
            System.out.println(fibonachiArray[j]);
            j++;
        }

        /* 3. Напишите программу, которая выводит последовательность чисел Фибоначчи. Первые два
        числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
        (получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
        Количество чисел в последовательности вводится пользователем. Предложите версии программы,
        использующие разные операторы цикла.
         */

    }
}
