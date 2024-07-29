package projeto;

import java.util.List;
import java.util.Scanner;

public class MedicoCLI {
    private Scanner scanner;

    public MedicoCLI() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("""
                        \n=== Sistema de Cadastro de Médicos ===
                        \n1 - Adicionar médico
                        \n2 - Listar médicos
                        \n0 - Sair\n""");
    }

    public Operacao obterOperacao() {
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return Operacao.fromCodigo(opcao);
    }

    public Medico obterDadosMedico() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CRM: ");
        String crm = scanner.nextLine();
        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        return new Medico(nome, crm, idade, telefone, especialidade);
    }

    public void listarMedicos(List<Medico> medicos) {
        System.out.println("\n=== Lista de Médicos ===");
        if (medicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
        } else {
            for (Medico medico : medicos) {
                System.out.println(medico);
            }
        }
    }
}
