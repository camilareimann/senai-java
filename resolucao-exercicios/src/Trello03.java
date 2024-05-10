import java.util.Scanner;

public class Trello03 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int distanciaPlacas = 1000;

    System.out.println("Informe o tempo (em segundos) que levou para o veiculo ir de uma placa a outra: ");
    int tempo = scan.nextInt();

    int velocidadeMedia = distanciaPlacas / tempo;

    System.out.printf("A velocidade média do veículo foi de %dkm/h", velocidadeMedia);

    scan.close();

}
}
