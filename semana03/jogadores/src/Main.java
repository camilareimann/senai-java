import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador(1, "Jogador Um", "J1", new Date(), 1, "Goleiro", 85, 1, 0));
        jogadores.add(new Jogador(2, "Jogador Dois", "J2", new Date(), 2, "Defensor", 80, 0, 0));
        jogadores.add(new Jogador(3, "Jogador Três", "J3", new Date(), 3, "Defensor", 78, 2, 0));
        jogadores.add(new Jogador(4, "Jogador Quatro", "J4", new Date(), 4, "Defensor", 82, 3, 0));
        jogadores.add(new Jogador(5, "Jogador Cinco", "J5", new Date(), 5, "Defensor", 79, 0, 1));
        jogadores.add(new Jogador(6, "Jogador Seis", "J6", new Date(), 6, "Meio-campista", 84, 1, 0));
        jogadores.add(new Jogador(7, "Jogador Sete", "J7", new Date(), 7, "Meio-campista", 83, 2, 0));
        jogadores.add(new Jogador(8, "Jogador Oito", "J8", new Date(), 8, "Meio-campista", 81, 1, 0));
        jogadores.add(new Jogador(9, "Jogador Nove", "J9", new Date(), 9, "Atacante", 87, 2, 0));
        jogadores.add(new Jogador(10, "Jogador Dez", "J10", new Date(), 10, "Atacante", 90, 1, 1));
        jogadores.add(new Jogador(11, "Jogador Onze", "J11", new Date(), 11, "Atacante", 89, 0, 0));

        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}
