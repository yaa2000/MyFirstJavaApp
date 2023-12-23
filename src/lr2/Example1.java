package lr2;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = in.nextInt();
        int y = x % 3;
        if (y == 0) {
            System.out.println("Введенное число делится на 3 без остатка");
        } else {
            System.out.println("Введенное число не делится на 3 без остатка");
        }
    }
}
