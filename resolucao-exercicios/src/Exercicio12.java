import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao, quantidadeAlunos=0;
        double[][] notas = null;
        String[] alunos = new String[1];
        do{
            System.out.println("1 - Cadastrar alunos \n2 - Cadastrar notas \n3 - Gerar relatorio \n4 - Sair \nEscolha uma opção:");
            opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Quantidade de alunos:");
                    quantidadeAlunos = scan.nextInt();
                    alunos = new String[quantidadeAlunos];
                    
                    for(int i = 0; i < quantidadeAlunos; i++){
                        System.out.println("Digite o nome do " + (i + 1) + "º Aluno:");
                        alunos[i] = scan.next();
                    }

                    System.out.println("Alunos cadastrados com sucesso!");
                    break;

                case 2:
                    System.out.println("Cadastrando notas...");
                    notas = new double[quantidadeAlunos][3];
                    for(int linha = 0; linha < notas.length; linha++){
                        System.out.println("Digite as notas do aluno " + alunos[linha] + ":");
                        for(int j = 0; j < notas[0].length; j++){
                            System.out.println("Digite a " + (j + 1) + "ª nota:");
                            notas[linha][j] = scan.nextDouble();
                        }
                    }
                    break;
                case 3:
                if (notas != null) {
                    System.out.println("Gerando relatório...");
                    System.out.println("Relatório de Notas:");
                    for (int i = 0; i < quantidadeAlunos; i++) {
                        double soma = 0;
                        for (int j = 0; j < notas[i].length; j++) {
                            soma += notas[i][j];
                        }
                        double media = soma / notas[i].length;
                        System.out.printf("Aluno: %s - Média: %.2f\n", alunos[i], media);
                    }
                } else {
                    System.out.println("É necessário cadastrar notas primeiro.");
                }
                break;
                case 4:
                    System.out.println("Saiu do sistema!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 4);

        scan.close();
    }
}
