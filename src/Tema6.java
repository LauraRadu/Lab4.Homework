//6.     Se da un sir de numere. Sa se afiseze: numarul maxim, numarul minim, suma lor, sirul dublat .

public class Tema6 {

    public static void main(String[] args) {
        int[] numbers = {13, 75, 35, 96, 15};

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximul este: " + max);

        int min = numbers[0];
        for(int j = 0; j < numbers.length; j++) {
            if(numbers[j] < min) {
                min = numbers[j];
            }
        }
        System.out.println("Minimul este: " + min);

        int sum = 0;
        for (int k = 0; k < numbers.length; k++) {
            sum += numbers[k];
        }
        System.out.println("Suma numerelor din sir este: " + sum);

        System.out.println("Sirul dublat este: ");
        for(int m = 0; m < numbers.length; m++) {
            System.out.println(numbers[m] * 2);
        }
    }
}
