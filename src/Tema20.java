//20. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru a doua jumatate sa se afseze numerele triplate daca sunt
// impare si numerele asa cum sunt in sir daca sunt pare.

public class Tema20 {
    public static void main(String[] args) {
        int[] numbers = {1, 2,4,6,7,8,10};
        int half = numbers.length / 2;

        for (int j = 0; j < half; j++) {
            numbers[j] *= 2;
            System.out.print(numbers[j] + ", ");
        }
        for (int j = half; j >= half && j < numbers.length; j++) {
            if (numbers[j] % 2 == 0) {
                System.out.print(numbers[j] + ", ");
            } else {
                numbers[j] *= 3;
                System.out.print(numbers[j] + ", ");
            }
        }

    }
}
