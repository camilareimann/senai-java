import java.util.Scanner;

public class Trello01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("CALCULO DE AREA DO TERRENO");

        System.out.print("Qual a largura do terreno? ");
        int base = scan.nextInt();

        System.out.print("Qual a altura do terreno? ");
        int altura = scan.nextInt();

        int area = base * altura;

        System.out.printf("A area do terreno é: %dm²", area);

        scan.close();
    }
}