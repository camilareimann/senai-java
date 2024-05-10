import java.util.Scanner;

public class Exercicio02 {
public static void main(String[] args) {
    /*Crie um programa que calcule o FCM */

    Scanner scan = new Scanner(System.in);

    int idade, fcm;

    System.out.println("CALCULO DE FCM");
    System.out.print("Digite a sua idade: ");
    idade = scan.nextInt();

    fcm = 220 - idade;

    System.out.println("Seu FCM é: " + fcm + " bpm");

    scan.close();
}
}
