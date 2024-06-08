package exercicioProfe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        try {
            cadastrarUser(nome);
        } catch (CalculadoraException e) {
        System.out.println(e.getMessage());
        }

    }

    private static void cadastrarUser(String nome) throws CalculadoraException{
        if(nome.equals("")){
            throw new CalculadoraException("Nome inválido");
        }

        Paciente paciente = null;
        paciente.setNome(nome);
    }
}
