//4.     Se da un numar in grade Fahrenheit. Sa se converteasca in Celsius stiind formula.

import java.util.Scanner;

public class Tema4 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        double fahrenheit = number.nextInt();
        double celsius = (fahrenheit - 32.0) * (5 / 9.0);
        System.out.println(fahrenheit + " grade Fahrenheit reprezinta " +  String.format( "%.2f", celsius ) + " grade Celsius.");
    }
}