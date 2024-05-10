import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int tempoServico;
    double salario;

    System.out.println("Qual o seu salário?");
    salario = scan.nextDouble();

    System.out.println("Quanto tempo de serviço?");
    tempoServico = scan.nextInt();

    if (tempoServico > 5){
        System.out.println("Salario ogiginal: " + salario + 
        "\nBonus: " + salario * 0.10 + "\nNovo salario: " + 
        (salario * 1.1));
    } else {
        System.out.println("Salario ogiginal: " + salario + 
        "\nBonus: " + salario * 0.05 + "\nNovo salario: " + 
        (salario * 1.05));
    }
    scan.close();
}
}
