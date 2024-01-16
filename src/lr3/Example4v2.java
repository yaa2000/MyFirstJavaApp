package lr3;

import java.util.Scanner;

public class Example4v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("С использованием цикла for");
        if (x > y) {
            for (int i = y; x >= i; i++) {
                System.out.println(i);
            }
        } else {
            for (int j = x; y >= j; j++) {
                System.out.println(j);
            }
        }

        /* 4. Напишите программу, в которой пользователем вводится два целых числа. Программа
        выводит все целые числа — начиная с наименьшего (из двух введенных чисел) и заканчивая
        наибольшим (из двух введенных чисел). Предложите разные версии программы (с использованием
        разных операторов цикла).
         */

    }
}
