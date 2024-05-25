import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Conta conta = new Conta();
            System.out.println("Preencha as informações da conta");
            System.out.println();
            System.out.println("Número da conta:");
            conta.setNumeroConta(scanner.nextInt());
            System.out.println();
            System.out.println("Nome do correntista:");
            conta.setNomeCorrentista(scanner.next());
            System.out.println();
            System.out.println("Saldo inicial:");
            conta.setSaldo(scanner.nextDouble());
            System.out.println();

            while(true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Imprimir saldo");
                System.out.println("4 - Sair");
                int opcao = scanner.nextInt();
                System.out.println();
                if(opcao == 1) {
                    System.out.println("Digite o valor do depósito:");
                    conta.depositar(Double.parseDouble(scanner.next()));
                    System.out.println();
                } else if(opcao == 2) {
                    System.out.println("Digite o valor do saque:");
                    conta.sacar(Double.parseDouble(scanner.next()));
                    System.out.println();
                } else if(opcao == 3) {
                    conta.imprimirSaldo();
                    System.out.println();
                } else if(opcao == 4) {
                    break;
                } else {
                    System.out.println("Opção inválida");
                    System.out.println();
                }
            }
        }
    }
}
