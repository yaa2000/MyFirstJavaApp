package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        LocalDate current = LocalDate.now();
        int age = current.getYear() - year;
        System.out.println(name + " " + age + " лет");
        in.close();
     }
}
