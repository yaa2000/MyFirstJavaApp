package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое делится на 5 с остатком 2 и делится на 7 с остатком 1:");
        int x = in.nextInt();
        if ( x % 5 == 2 & x % 7 == 1) {
            System.out.println("Верно, число делится на 5 с остатком 2 и делится на 7 с остатком 1");
        } else {
            System.out.println("Введенное число не удовлетворяет заданным условиям");
        }
    }
}
