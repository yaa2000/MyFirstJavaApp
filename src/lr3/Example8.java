package lr3;

public class Example8 {
    public static void main(String[] args) {
        char[] consonants = new char[10];
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'Y'};
        char letter = 'A';
        for (int i = 0; i < consonants.length; i++) {
            boolean check = true;
            for (int j = 0; j < vowels.length; j++) {
                if (letter == vowels[j]) {
                    i--;
                    check = false;
                    break;
                }
            }
            if (check) {
                consonants[i] = letter;
                System.out.println(consonants[i]);
            }
            letter++;
        }

    /* 8. Напишите программу, в которой создается символьный массив из 10 элементов. Массив
    заполнить большими (прописными) буквами английского алфавита. Буквы берутся подряд, но только
    согласные (то есть гласные буквы ’ А','Е' и 'I' при присваивании значений элементам массива
    нужно пропустить). Отобразите содержимое созданного массива в консольном окне.
     */

    }
}
