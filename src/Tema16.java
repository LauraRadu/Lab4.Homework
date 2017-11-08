//16. Sa se calculeze factorialul unui numar a .
//        factorialul este definit asa:
//        factorial  = 1*2*3*4….*a
//
//        de ex pentru a = 4, factorialul este 1*2*3*4

public class Tema16 {
    public static void main(String[] args) {
        int a = 9;
        long factorial = 1;

        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                factorial *= i;
            }
            System.out.println(a + "! este egal cu " + factorial);
        }

        else {
            System.out.println("Error!");
        }
    }
}
