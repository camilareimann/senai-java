package telas;

import entidades.Paciente;
import repositorio.ListaPacientes;

import java.util.Scanner;
import java.util.List;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        while (true) {
            System.out.println("""
                    Escolha uma ação:
                     1 - Cadastrar um novo paciente
                     2 - Listar todos os pacientes
                     3 - Alterar informações do paciente
                     4 - Mostrar informações de um paciente
                     5 - Registrar atividade física para um paciente
                     6 - Remover paciente
                     7 - Sair""");


            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarNovoPaciente();
                    continue;
                case 2:
                    listarPacientes();
                    continue;
                case 3:
                    alterarInformacoesPaciente();
                    continue;
                case 4:
                    mostrarInformacoesPaciente();
                    continue;
                case 5:
                    registrarAtividadeFisicaPaciente();
                    continue;
                case 6:
                    removerPaciente();
                    continue;
                case 7:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    continue;
            }
        }
    }

    private static void cadastrarNovoPaciente() {
        Paciente paciente = new Paciente();
        System.out.print("Nome do Paciente: ");
        paciente.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        paciente.setIdade(scanner.nextInt());
        System.out.print("Peso: ");
        paciente.setPeso(scanner.nextDouble());
        System.out.print("Altura: ");
        paciente.setAltura(scanner.nextDouble());
        System.out.print("Pressão Arterial: ");
        paciente.setPressaoArterial(scanner.nextDouble());
        System.out.print("Frequência Cardíaca: ");
        paciente.setFrequenciaCardiaca(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Dieta Alimentar: ");
        paciente.setDietaAlimentar(scanner.nextLine());

        ListaPacientes.adicionar(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    private static void listarPacientes() {
        List<Paciente> pacientes = ListaPacientes.listar();
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(i + " - " + pacientes.get(i).getNome());
        }
    }

    private static void alterarInformacoesPaciente() {
        System.out.print("ID do paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Paciente paciente = ListaPacientes.buscarPorId(id);
        if (paciente != null) {
            System.out.print("Novo Peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Nova Altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Nova Pressão Arterial: ");
            double pressaoArterial = scanner.nextDouble();
            System.out.print("Nova Frequência Cardíaca: ");
            double frequenciaCardiaca = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nova Dieta Alimentar: ");
            String dietaAlimentar = scanner.nextLine();

            ListaPacientes.alterar(id, peso, altura, pressaoArterial, frequenciaCardiaca, dietaAlimentar);
            System.out.println("Informações alteradas com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void mostrarInformacoesPaciente() {
        System.out.print("ID do paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Paciente paciente = ListaPacientes.buscarPorId(id);
        if (paciente != null) {
            System.out.println(paciente.monitoramentoPaciente());
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void registrarAtividadeFisicaPaciente() {
        System.out.print("ID do paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome da atividade física: ");
        String atividade = scanner.nextLine();

        Paciente paciente = ListaPacientes.buscarPorId(id);
        if (paciente != null) {
            paciente.registrarAtividadeFisica(atividade);
            System.out.println("Atividade registrada com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private static void removerPaciente() {
        System.out.print("ID do paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        ListaPacientes.remover(id);
        System.out.println("Paciente removido com sucesso!");
    }
}
