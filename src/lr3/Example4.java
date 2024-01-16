package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("С использованием цикла while");
        if (x > y) {
            while (x >= y){
            System.out.println(y);
            y++;
            }
        } else {
            while (y >= x){
            System.out.println(x);
            x++;
            }
        }

        /* 4. Напишите программу, в которой пользователем вводится два целых числа. Программа
        выводит все целые числа — начиная с наименьшего (из двух введенных чисел) и заканчивая
        наибольшим (из двух введенных чисел). Предложите разные версии программы (с использованием
        разных операторов цикла).
         */

    }
}
