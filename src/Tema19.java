//19. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
//        de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}

public class Tema19 {
    public static void main(String[] args) {
        int[] numbers = {0,9,10,2,1,-2,-2};
        boolean a = true;

        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] < numbers[i-1]) {
                int swap = numbers[i];
                numbers[i] = numbers[i-1];
                numbers[i-1] = swap;
                if(i > 1) {
                    i -= 2;
                }
                a = false;
            }
        }

        if (a == false) {
            System.out.print("Sirul ordonat crescator este: ");
            for(int i = 0; i<numbers.length; i++) {
                System.out.print(numbers[i] + ", ");
            }
        }
        else {
            System.out.println("Sirul a fost crescator de la inceput.");
        }

    }
}