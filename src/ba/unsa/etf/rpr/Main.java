package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    static int SumaCifara(int n) {
        int m, suma = 0;
        while (n > 0) {
            m = n % 10;
            suma += m;
            n = n / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Pozdrav svima!");
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi broj n:");
        int n = ulaz.nextInt();
        System.out.println("Brojevi izmedju 1 i n koji su djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i <= n; i++) {
            if (i % SumaCifara(n) == 0) {
                System.out.println(i);
            }
        }
    }

}
