import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int votosZezinho = 0, votosLunguinho = 0, votosLuizinho = 0, votosFernanda = 0, votosTioPatinhas = 0, votosPatoDonaldo = 0, votosNulos = 0, votosBrancos = 0, totalVotos = 0;

        while (true) {
            System.out.println("1 - Zezinho");
            System.out.println("2 - Lunguinho");
            System.out.println("3 - Luizinho");
            System.out.println("4 - Fernanda");
            System.out.println("5 - Tio Patinhas");
            System.out.println("6 - Pato Donaldo");
            System.out.println("7 - Branco");
            System.out.println("Entre com seu voto (ou digite 'shut down' para encerrar):");
            
            String voto = scan.nextLine();
            
            if (voto.equalsIgnoreCase("shut down")) {
                break;
            }
            
            int opcao = 0;
            try {
                opcao = Integer.parseInt(voto);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Voto contabilizado como nulo.");
                votosNulos++;
                totalVotos++;
                continue;
            }
            
            if (opcao < 1 || opcao > 7) {
                System.out.println("Opção inválida. Voto contabilizado como nulo.");
                votosNulos++;
                totalVotos++;
            } else {
                switch (opcao) {
                    case 1:
                        votosZezinho++;
                        break;
                    case 2:
                        votosLunguinho++;
                        break;
                    case 3:
                        votosLuizinho++;
                        break;
                    case 4:
                        votosFernanda++;
                        break;
                    case 5:
                        votosTioPatinhas++;
                        break;
                    case 6:
                        votosPatoDonaldo++;
                        break;
                    case 7:
                        votosBrancos++;
                        break;
                }
                totalVotos++;
            }
        }
        
        double porcentagemNulos = (double) votosNulos / totalVotos * 100;
        double porcentagemBrancos = (double) votosBrancos / totalVotos * 100;
        
        System.out.println("Resultado da votação:");
        System.out.println("Zezinho: " + votosZezinho + " votos");
        System.out.println("Lunguinho: " + votosLunguinho + " votos");
        System.out.println("Luizinho: " + votosLuizinho + " votos");
        System.out.println("Fernanda: " + votosFernanda + " votos");
        System.out.println("Tio Patinhas: " + votosTioPatinhas + " votos");
        System.out.println("Pato Donaldo: " + votosPatoDonaldo + " votos");
        System.out.println("Votos nulos: " + votosNulos + " (" + porcentagemNulos + "%)");
        System.out.println("Votos brancos: " + votosBrancos + " (" + porcentagemBrancos + "%)");

        scan.close();
    }
}

