package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = in.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = in.nextInt();
        int result = number1 + number2;
        System.out.println("Сумма: " + result);
        in.close();
    }
}
