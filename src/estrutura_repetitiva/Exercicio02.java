package estrutura_repetitiva;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /* escreva um programa para ler as coordenadas (x, y) de
        uma quantidade indeterminada de pontos no sistema cartesiano.
        para cada ponto escrever o quadrante a que ele pertence.
        o algoritmo será encerrado quando pelo menos uma das duas
        coordenadas for nula (nesta situação sem escrever mensagem
        alguma).*/

        Scanner sc = new Scanner(System.in);
        int coordX;
        int coordY;

        coordX = sc.nextInt();
        coordY = sc.nextInt();

        while (coordX != 0 && coordY != 0) {
            if (coordX > 0 && coordY > 0) {
                System.out.println("Pertencente ao 1° quadrante");
            } else if (coordX < 0 && coordY > 0) {
                System.out.println("Pertencente ao 2° quadrante");
            } else if (coordX < 0 && coordY < 0) {
                System.out.println("Pertencente ao 3° quadrante");
            } else {
                System.out.println("Pertencente ao 4° quadrante");
            }
            System.out.println("Digite novas coordenadas x e y: ");
            coordX = sc.nextInt();
            coordY = sc.nextInt();
        }

    }
}
