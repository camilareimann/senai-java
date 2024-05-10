import java.util.Scanner;

public class Trello02 {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double salarioMininmo = 1412.00;

    System.out.println("Informe o valor do seu salário: ");
    double salarioUsuario = scan.nextDouble();
    double qtdSalariosMinimos = salarioUsuario / salarioMininmo;
    System.out.printf("Você recebe %.2f salários mínimos", qtdSalariosMinimos);

    scan.close();
    
}
}
