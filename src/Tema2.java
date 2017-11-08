// 2.     Sa se calculeze media aritmetica a N numere.

public class Tema2 {
    public static void main(String[] args) {
        double sum = 0;
        int n = 20;
        double average;

        for(int i=1; i<=n; i++) {
            sum += i;
        }
        average = sum/n;
        System.out.println("Media aritmetica a numerelor naturale de la 1 la " + n + " este egala cu " + average);
    }
}

