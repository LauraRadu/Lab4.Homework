//5.     Se se afiseze o tabela de conversie din Fahrenheit in Celsius intre gradul X si gradul Y.

public class Tema5 {
    public static void main(String[] args) {
        //fahrenheit
        double min = 32.0;
        double max = 50.0;

        double celsius;

        System.out.println("Tabela de conversie Fahrenheit - Celsius: ");
        for (double fahrenheit = min; fahrenheit <= max; fahrenheit++) {
            celsius = (fahrenheit - 32.0) * (5 / 9.0);
            System.out.println(fahrenheit + " grade Fahrenheit - " + String.format( "%.2f", celsius ) + " grade Celsius");
        }
    }
}
