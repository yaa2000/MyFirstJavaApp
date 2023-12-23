package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое не меньше 10 и делится на 4:");
        int x = in.nextInt();
        if (x >= 10 & x % 4 == 0) {
            System.out.println("Верно, число не меньше 10 и делится на 4 без остатка");
        } else {
            System.out.println("Введенное число не удовлетворяет заданным условиям");
        }
    }
}
