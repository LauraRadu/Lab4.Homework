//3.     Se se calculeze media aritmetica pana ce numarul citit este 0.

import java.util.Scanner;

public class Tema3 {

    public static void main(String[] args) {
        double sum = 0.0;
        int i = 0;
        Scanner newNumber = new Scanner(System.in);
        System.out.println("Introduceti numere: ");
        int num = newNumber.nextInt();
        while(num != 0) {
            sum += num;
            i++;
            num = newNumber.nextInt();
        }
        double mean = sum/i;
        System.out.println("Media numerelor introduse este = " + mean);

    }
}

