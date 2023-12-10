package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц и количество дней в нем: ");
        String month = in.nextLine();
        int days = in.nextInt();

        System.out.println("В месяце " + month + " " + days + " дней.");
        in.close();
    }
}
