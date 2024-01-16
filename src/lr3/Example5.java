package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int size = in.nextInt();
        System.out.println("Количество чисел: " + size);
        System.out.println("С использование цикла for");
        int[] numbers = new int[size];
        Random rnd = new Random();
        int sum = 0;
        for (int i = 0; i < numbers.length; ) {
            int x = rnd.nextInt(100);
            if (x % 5 == 2 | x % 3 == 1) {
                numbers[i] = x;
                System.out.println(numbers[i]);
                sum = sum + numbers[i];
                i++;
            } else {
                i = i;
            }
        }
        System.out.println("Сумма всех чисел: " + sum);


        /* 5. Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким
        критериям: при делении числа на 5 в остатке получа-ется 2, или при делении на 3 в
        остатке получается 1. Количество чисел в сумме вводится пользователем. Программа
        отображает числа, которые суммируются, и значение суммы. Предложите версии программы,
        использующие разные операторы цикла.
         */

    }
}
