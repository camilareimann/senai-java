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

        if (imc < 18.5) {
            System.out.println(" - Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println(" - Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println(" - Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println(" - Obesidade grau 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println(" - Obesidade grau 2");
        } else {
            System.out.println(" - Obesidade grau 3");
        }

        scan.close();

    }
}
