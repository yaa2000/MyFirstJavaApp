package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        if (size > 0) {
            int[] numbers = new int[size];
            for (int i = 0; i < numbers.length; ) {
                int x = rnd.nextInt(100);
                if (x % 5 == 2) {
                    numbers[i] = x;
                    System.out.println(numbers[i]);
                    i++;
                } else {
                    i = i;
                }
            }
        } else {
            System.out.println("Введено некорректное значение");
        }

        /* 6. Напишите программу, в которой создается одномерный числовой массив и заполняется
        числами, которые при делении на 5 дают в остатке 2 (числа 2, 7,12,17 и так далее).
        Размер массива вводится пользователем. Предусмотреть обработку ошибки, связанной с вводом
        некорректного значения.
         */


    }
}
