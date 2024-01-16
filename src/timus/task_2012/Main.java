package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTasks = in.nextInt();
        int otherTasks = 240 / 45;
        if ((12 - numberOfTasks) <= otherTasks) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
