import java.util.Scanner;
import java.util.Locale;

public class AppTerreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //entradas
        double largura, comprimento, precoDoMetroQ;

        System.out.print("Informe a largura e o comprimento do terreno: ");
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();

        System.out.print("Agora, informe o preço do metro quadrado: ");
        precoDoMetroQ = sc.nextDouble();

        //calculos
        double area = largura * comprimento;
        double precoTerreno = area * precoDoMetroQ;

        //saidas
        System.out.printf("AREA DO TERRENO: %.2f%n", area);
        System.out.printf("PREÇO: %.2f%n", precoTerreno);

        sc.close();
    }
}