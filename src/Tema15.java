//5. Se dau doua numere a si n. sa se afiseze numarul a la puterea n
//        a =3
//        b = 20
//        se va calcula 3*3 *3
//
//        a = 3
//        b = 5
//        se va calcula 3*3*3*3*3

public class Tema15 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int product = a;
        boolean c = true;

        if(a != 0 || b != 0) {
            if (b != 0) {

                for (int i = 1; i <= b; i++) {
                    product *= a;
                }
                System.out.println(product);
            }
            else {
                System.out.println("1");
            }
            c = false;
        }

        else {
            System.out.println("Error!");
        }
    }
}
