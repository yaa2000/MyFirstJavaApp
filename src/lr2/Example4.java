package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 5 до 10 включительно:");
        int x = in.nextInt();
        if ( x >= x & x <= 10) {
            System.out.println("Верно!");
        } else {
            System.out.println("Введенное число не удовлетворяет заданным условиям");
        }

    }
}
