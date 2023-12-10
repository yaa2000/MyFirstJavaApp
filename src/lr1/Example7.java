package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя и возраст: ");
        String name = in.nextLine();
        int age = in.nextInt();

        System.out.println(name + " " + age);


    }
}
