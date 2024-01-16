package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String dayOfWeek = in.nextLine();
        System.out.println("С использованием switch");
        switch (dayOfWeek) {
            case "понедельник":
                System.out.println("Это первый день недели");
                break;
            case "вторник":
                System.out.println("Это второй день недели");
                break;
            case "среда":
                System.out.println("Это третий день недели");
                break;
            case "четверг":
                System.out.println("Это четвертый день недели");
                break;
            case "пятница":
                System.out.println("Это пятый день недели");
                break;
            case "суббота":
                System.out.println("Это шестой день недели");
                break;
            case "воскресенье":
                System.out.println("Это седьмой день недели");
                break;
            default:
                System.out.println("Такого дня не существует");
        }

        System.out.println("С использованием if");
        if (dayOfWeek.equals("понедельник")) {
            System.out.println("Это первый день недели");
        } else if (dayOfWeek.equals("вторник")) {
            System.out.println("Это второй день недели");
        } else if (dayOfWeek.equals("среда")) {
            System.out.println("Это третий день недели");
        } else if (dayOfWeek.equals("четверг")) {
            System.out.println("Это четвертый день недели");
        } else if (dayOfWeek.equals("пятница")) {
            System.out.println("Это пятый день недели");
        } else if (dayOfWeek.equals("суббота")) {
            System.out.println("Это шестой день недели");
        } else if (dayOfWeek.equals("воскресенье")) {
            System.out.println("Это седьмой день недели");
        } else {
            System.out.println("Такого дня не существует");
        }

       /* 2. Напишите программу, в которой пользователю предлагается ввести название дня недели.
       По введенному названию программа определяет порядковый номер дня в неделе. Если пользователь
       вводит неправильное название дня, программа выводит сообщение о том, что такого дня нет.
       Предложите версию программы на основе вложенных условных операторов и на основе оператора
       выбора switch.
        */

    }
}
