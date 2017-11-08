//18. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
//        suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n) .
//
//        exemplu
//
//        x = 4
//        n=5
//
//        suma = 1 + 4 +(4*4)+(4*4*4) +(4*4*4*4) +(4*4*4*4*4)

public class Tema18 {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int sum = 1;
        int product = 1;

        for(int i=1; i<=y; i++) {
            for(int j=1; j<=i; j++) {
                product *= x;
          //      System.out.println(product + "   hdiw");
            }
            sum += product;
       //     System.out.println(sum + "   hi");
            product = 1;
        }
        System.out.println(sum);
    }
}
