//17. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
//        de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8


public class Tema17 {
    public static void main(String[] args) {
        int[] numbers = {4,7,12,31,23,78,5,7,2};
        int a = 1;
        while (a < numbers.length) {
            if (numbers[a-1] > numbers[a]) {
                System.out.println(numbers[a-1] +" " + numbers [a]);
            }
            a++;
        }
        }
    }

