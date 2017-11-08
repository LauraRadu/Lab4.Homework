//11. Se da un sir de numere ordonate crescator.
//        Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
//        Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
//        sirul va fi definit asa, numerele sunt de exemplu.

public class Tema11 {
    public static void main(String[] args) {
        int[] a = {1,3,4,6,7,8,10,12,14,23};
        int n = 1;

        for(int i=0; i<a.length; i++) {
            if (a[i] == n) {
                System.out.println("Numarul dorit exista in sir si se afla pe pozitia " + (i+1));
                i = a.length;
            }
            else if (i == a.length -1) {
                System.out.println("-1");
            }
        }
    }
}

// intr-un sir neordonat nu mai e nevoie de conditia de iesire din loop la gasirea unui numar, in cazul in care acesta se poate gasi pe mai multe pozitii