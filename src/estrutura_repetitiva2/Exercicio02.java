package estrutura_repetitiva2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /* leia um valor inteiro n. este valor será a quantidade
        de valores inteiros x que serão lidos em seguida. mostre
        quantos destes valores estão dentro do intervalo [10,20]
        e quantos estão fora do intervalo. use as palavras "in"
        para dentro e "out" para fora. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // quantidade de valores inteiros x que serao lidos em seguida

        int intervaloMinimo = 10;
        int intervaloMaximo = 20;
        
        int countIn, countOut;
        countIn = countOut = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x >= intervaloMinimo && x <= intervaloMaximo) {
                countIn += 1;
            } else {
                countOut += 1;
            }
        }

        System.out.printf("Números dentro do intervalo: %d%n", countIn);
        System.out.printf("Números fora do intervalo: %d%n", countOut);

        sc.close();

    }
}
