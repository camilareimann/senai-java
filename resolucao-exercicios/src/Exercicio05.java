import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade?");
        idade = scan.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade <= 19) {
            System.out.println("Você é um adolescente");
        } else if (idade >= 20 && idade <= 59) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }

        scan.close();
    }
}
