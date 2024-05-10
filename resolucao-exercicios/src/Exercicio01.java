import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("CALCULO DE IMC");
        System.out.print("Digite o peso em Kg: ");
        peso = scan.nextDouble();

        System.out.print("Digite a altura em m: ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f", imc);

        scan.close();

    }
}
