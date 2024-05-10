import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double celcius, fahrenheit;

    System.out.println("CONVERSOR DE TEMPERATURA");
    System.out.print("Digite a temperatura em Celcius: ");
    celcius = scan.nextDouble();

    fahrenheit = (celcius * 9/5) + 32;

    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");

    scan.close();
}
}
