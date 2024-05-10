import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        int opcao;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Escolha o nivel de condicionamento: \n" +
                "1 - Iniciante\n" +
                "2 - Intermediário\n" +
                "3 - Avançado\n" +
                "Escolha uma opção: ");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1. Domingo -> Cinema\n" +
                        "2. Segunda -> 1h de musculação\n" +
                        "3. Terça -> 1h de natação\n" +
                        "4. Quarta -> Nada\n" +
                        "5. Quinta -> 1h de musculação\n" +
                        "6. Sexta -> 1h de natação\n" +
                        "7. Sábado -> Nada\n");
                break;
            case 2:
                System.out.println("1. Domingo -> 2h de caminhada\n" +
                        "2. Segunda -> 1h de musculação\n" +
                        "3. Terça -> 1h de natação\n" +
                        "4. Quarta -> 2h de caminhada\n" +
                        "5. Quinta -> 1h de musculação\n" +
                        "6. Sexta -> 1h de natação\n" +
                        "7. Sábado -> Nada\n");
                break;
            case 3:
                System.out.println("1. Domingo -> Futebol\n" +
                        "2. Segunda -> 1h de musculação\n" +
                        "3. Terça -> 1h de natação\n" +
                        "4. Quarta -> 2h de caminhada\n" +
                        "5. Quinta -> 1h de musculação\n" +
                        "6. Sexta -> 1h de natação\n" +
                        "7. Sábado -> Futebol\n");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scan.close();

    }
}
