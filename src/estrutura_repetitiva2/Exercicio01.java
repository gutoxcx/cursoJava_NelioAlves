package estrutura_repetitiva2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /* leia um valor inteiro x (1 ≤ x ≤ 1000). em seguida, mostre
        os ímpares de 1 até x, um valor por linha, inclusive o x, se
        for o caso. */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
