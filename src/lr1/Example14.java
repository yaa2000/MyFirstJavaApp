package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a, b, c, d;
        b = in.nextInt();
        a = b - 1;
        c = b + 1;
        d = (a + b + c) * (a + b + c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        in.close();
    }
}
