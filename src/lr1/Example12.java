package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        LocalDate current = LocalDate.now();
        int born = current.getYear() - age;
        System.out.println("Ваш год рождения: " + born);
        in.close();
    }
}
