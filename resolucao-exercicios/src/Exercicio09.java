import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeros[] = new int[10];
        int length = numeros.length;
        int numero;
        boolean numeroExiste = false;

        for (int i = 0; i < length; i++) {
            System.out.println("Digite um número: " + (i + 1) + " valor: ");
            numero = scan.nextInt();

            for (int j = 0; j < i; j++) {
                if (numero == numeros[j]) {
                    numeroExiste = true;
                }
            }

            if (numeroExiste) {
                System.out.println("Número já existe, \ndigite outro número");
                i--;
                numeroExiste = false;
            } else {
                numeros[i] = numero;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(numeros[i]);
        }

        scan.close();

    }
}


        // int tamanho = 10;
        // String nomes[];

        // nomes = new String[tamanho];

        // nomes[0] = "João";
        // nomes[1] = "Maria";
        // nomes[2] = "José";
        // nomes[3] = "Pedro";
        // nomes[4] = "Ana";
        // nomes[5] = "Carlos";
        // nomes[6] = "Mariana";
        // nomes[7] = "Paulo";
        // nomes[8] = "Cristina";
        // nomes[9] = "Felipe";

        // for (int i = 0; i < nomes.length; i++) {
        // System.out.println(nomes[i]);
        // }