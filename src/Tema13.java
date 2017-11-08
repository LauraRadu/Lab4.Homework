//13.Se citesc numere naturale pânã când se introduce numãrul 0. Afisati suma obtinutã prin adunarea doar a numerelor mai mari
// decat 4 si mai mici decat 11.

import java.util.Scanner;

public class Tema13 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner numbers = new Scanner(System.in);
        int number = 1;

        System.out.println("Introduceti numere naturale:");

        while (number != 0) {
            if (number > 4 && number < 11) {
                sum += number;
            }
            number = numbers.nextInt();
        }
        System.out.println("Suma numerelor mai mari decat 4 si mai mici decat 11 este: " + sum);
    }
}
