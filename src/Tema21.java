// 21. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.

public class Tema21 {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 10, 32, 27, 65, 4, 29};
        int[] newArray = new int[numbers.length];
        int a = 10;
        int b = 30;
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > a && numbers[i] < b) {
                newArray[j] = numbers[i];
                System.out.println(newArray[j]);
                j++;
            }
        }
    }
}

