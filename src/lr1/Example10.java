package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш год рождение: ");
        int year = in.nextInt();
        LocalDate current = LocalDate.now();
        int age = current.getYear()-year;
        System.out.println("Ваш возраст: " + age);



    }
}
