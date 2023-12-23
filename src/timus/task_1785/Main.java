package timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numderOfMonsters = in.nextInt();

        if (numderOfMonsters >= 1 & numderOfMonsters <= 4) {
            System.out.println("few");
        } else if (numderOfMonsters >= 5 & numderOfMonsters <= 9) {
            System.out.println("several");
        } else if (numderOfMonsters >= 10 & numderOfMonsters <= 19) {
        System.out.println("pack");
        } else if (numderOfMonsters >= 20 & numderOfMonsters <= 49) {
            System.out.println("lots");
        } else if (numderOfMonsters >= 50 & numderOfMonsters <= 99) {
            System.out.println("horde");
        } else if (numderOfMonsters >= 100 & numderOfMonsters <= 249) {
            System.out.println("throng");
        } else if (numderOfMonsters >= 250 & numderOfMonsters <= 499) {
            System.out.println("swarm");
        } else if (numderOfMonsters >= 500 & numderOfMonsters <= 999) {
            System.out.println("zounds");
        } else if (numderOfMonsters >= 1000) {
            System.out.println("legion");
        }
        System.out.flush();
    }
}
