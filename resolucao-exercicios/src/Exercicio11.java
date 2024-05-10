import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // int[][] matriz = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 },
        // };

        // for (int [] linha : matriz) {
        // for (int coluna : linha) {
        // System.out.print(coluna + " ");
        // }
        // System.out.println();
        // }
        Scanner scan = new Scanner(System.in);
        double[][] notas = new double[3][3];
        String[] alunos = { "camila", "joao", "maria" };

        for (int linha = 0; linha < notas.length; linha++) {
            System.out.println("Digite as 3 notas do aluno " + alunos[linha] + ":");
            for (int coluna = 0; coluna < notas[0].length; coluna++) {
                notas[linha][coluna] = scan.nextDouble();
            }
        }

        for (int linha = 0; linha < notas.length; linha++) {
            System.out.println("Notas do " + alunos[linha] + "º aluno");
            for (int coluna = 0; coluna < notas[0].length; coluna++) {
                System.out.print((coluna + 1) + "ª nota: " + notas[linha][coluna] + " ");
            }
        }
        scan.close();
    }
}
