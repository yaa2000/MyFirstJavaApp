package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String week = in.nextLine();

        System.out.println("Введите название месяц: ");
        String month = in.nextLine();

        System.out.println("Введите день месяца: ");
        int date = in.nextInt();

        System.out.println(week + " " + date + " " + month);
        in.close();

    }
}
