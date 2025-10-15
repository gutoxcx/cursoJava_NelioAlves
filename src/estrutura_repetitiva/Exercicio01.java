package estrutura_repetitiva;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
         * Escreva um programa que repita a leitura de uma senha até que ela seja
         * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
         * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
         * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
         * correta é o valor 2002.
         */
        Scanner sc = new Scanner(System.in);

        int senhaValida = 2002;
        int entradaSenha = 0;

        while (entradaSenha != senhaValida) {
            System.out.print("Digite a senha: ");
            entradaSenha = sc.nextInt();
            System.out.println("Senha inválida, tente novamente.");
        }
        System.out.println("Senha válida, ACESSO PERMITIDO!");
        sc.close();

    }
}
