package lr3;

public class Example7 {
    public static void main(String[] args) {
        char[] alphabet = new char[10];
        char letter = 'a';
        for (int i = 0; i < alphabet.length; ) {
            if (letter % 2 == 1) {
                alphabet[i] = letter;
                System.out.println(alphabet[i]);
                i++;
            } else {
                i = i;
            }
            letter++;
        }
        System.out.println("В обратном порядке:");
        for (int j = 9; j >= 0; j--) {
            System.out.println(alphabet[j]);
        }

        /* 7. Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
        Массив заполняется буквами «через одну», начиная с буквы ' а ': то есть массив заполняется
        буквами 'а', 'с', ' е', 'д' и так далее. Отобразите массив в консольном окне в прямом и
        обратном порядке. Размер массива задается переменной.
         */

    }
}
