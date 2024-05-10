import java.util.Scanner;

public class Trello04 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasSemana = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
        int[] caloriasConsumidas = new int[7];

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.print("Quantas calorias você consumiu na " + diasSemana[i] + "? ");
            caloriasConsumidas[i] = scanner.nextInt();
        }
        int totalCalorias = 0;
        int diasAcimaRecomendacao = 0;
        for (int calorias : caloriasConsumidas) {
            totalCalorias += calorias;
            if (calorias > 2000) {
                diasAcimaRecomendacao++;
            }
        }
        double mediaDiaria = (double) totalCalorias / diasSemana.length;

        System.out.println("\nTotal de calorias consumidas na semana: " + totalCalorias);
        System.out.println("Média diária de calorias consumidas: " + String.format("%.2f", mediaDiaria));
        System.out.println("Dias em que o consumo de calorias foi superior à recomendação diária de 2000 calorias: " + diasAcimaRecomendacao);

        scanner.close();
    }
}
