import java.util.Random;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /* Escreva no console todos os numeros pares de 1 até 100 */

        // par
        int contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }

        // impar
        contador = 1;
        while (contador <= 100) {
            if (contador % 2 == 1) {
                System.out.println(contador);
            }
            contador++;
        }

        // Random random = new Random();
        Scanner scan = new Scanner(System.in);

        // int numeroAleatorio = random.nextInt(11);
        // int palpite;

        // do {
        // System.out.println("Digite um número de 0 a 10: ");
        // palpite = scan.nextInt();

        // if (palpite == numeroAleatorio) {
        // System.out.println("Você acertou!\nNumero Sorteado: " + numeroAleatorio);
        // } else {
        // System.out.println("Você errou! Tente novamente");
        // }

        // } while (palpite != numeroAleatorio);

        // for (int i = 0; i <= 5; i++) {
        // System.out.println(i);
        // }

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }

        scan.close();
    }
}
