package telas;

import entidades.*;
import repositorios.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                     7 - Cadastro de Funcionário
                     8 - Cadastro de Nutricionista
                     9 - Criar consulta
                     10 - Listar Funcionários
                     11 - Listar Consultas
                     12 - Realizar consulta
                     13 - Sair""");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarNovoPaciente();
                    break;
                case 2:
                    listarPacientes();
                    break;
                case 3:
                    alterarInformacoesPaciente();
                    break;
                case 4:
                    mostrarInformacoesPaciente();
                    break;
                case 5:
                    registrarAtividadeFisicaPaciente();
                    break;
                case 6:
                    removerPaciente();
                    break;
                case 7:
                    cadastrarFuncionario();
                    break;
                case 8:
                    cadastrarNutricionista();
                    break;
                case 9:
                    criarConsulta();
                    break;
                case 10:
                    listarFuncionarios();
                    break;
                case 11:
                    listarConsultas();
                    break;
                case 12:
                    realizarConsulta();
                    break;
                case 13:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
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

    private static void cadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        System.out.print("Nome do Funcionário: ");
        funcionario.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        funcionario.setIdade(scanner.nextInt());
        scanner.nextLine();
        Endereco endereco = cadastrarEndereco();
        funcionario.setEndereco(endereco);
        System.out.print("Salário: ");
        funcionario.setSalario(scanner.nextDouble());
        scanner.nextLine();

        ListaFuncionarios.adicionar(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static Endereco cadastrarEndereco() {
        Endereco endereco = new Endereco();
        System.out.print("Logradouro: ");
        endereco.setLogradouro(scanner.nextLine());
        System.out.print("Estado: ");
        endereco.setEstado(scanner.nextLine());
        System.out.print("Cidade: ");
        endereco.setCidade(scanner.nextLine());
        System.out.print("Número: ");
        endereco.setNumero(scanner.nextInt());
        scanner.nextLine();
        System.out.print("CEP: ");
        endereco.setCep(scanner.nextLine());
        return endereco;
    }

    private static void cadastrarNutricionista() {
        Nutricionista nutricionista = new Nutricionista();
        System.out.print("Nome do Nutricionista: ");
        nutricionista.setNome(scanner.nextLine());
        if (ListaNutricionistas.buscarPorNome(nutricionista.getNome()) != null) {
            System.out.println("Nome duplicado. Não é possível cadastrar esse nutricionista.");
            return;
        }
        System.out.print("Idade: ");
        nutricionista.setIdade(scanner.nextInt());
        scanner.nextLine();
        Endereco endereco = cadastrarEndereco();
        nutricionista.setEndereco(endereco);
        System.out.print("Salário: ");
        nutricionista.setSalario(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Tempo de experiência: ");
        nutricionista.setTempoExperiencia(scanner.nextInt());
        scanner.nextLine();
        nutricionista.setCertificacoes(new ArrayList<>());
        nutricionista.setNumeroConsultas(0);

        ListaNutricionistas.adicionar(nutricionista);
        System.out.println("Nutricionista cadastrado com sucesso!");
    }

    private static void criarConsulta() {
        System.out.print("Nome do Nutricionista: ");
        String nomeNutricionista = scanner.nextLine();
        Nutricionista nutricionista = ListaNutricionistas.buscarPorNome(nomeNutricionista);
        if (nutricionista == null) {
            System.out.println("Nutricionista não encontrado.");
            return;
        }
        System.out.print("Nome do Paciente: ");
        String nomePaciente = scanner.nextLine();
        Paciente paciente = ListaPacientes.buscarPorNome(nomePaciente);
        if (paciente == null) {
            System.out.println("Paciente não encontrado.");
            return;
        }
        System.out.print("Data e Hora (aaaa-mm-ddThh:mm): ");
        LocalDateTime dataHora = LocalDateTime.parse(scanner.nextLine());
        Consulta consulta = new Consulta(nomeNutricionista, nomePaciente, dataHora, false);
        ListaConsultas.adicionar(consulta, nutricionista);
        System.out.println("Consulta criada com sucesso!");
    }

    private static void listarFuncionarios() {
        List<Funcionario> funcionarios = ListaFuncionarios.listar();
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(i + " - " + funcionarios.get(i).getNome());
        }
    }

    private static void listarConsultas() {
        List<Consulta> consultas = ListaConsultas.listar();
        for (Consulta consulta : consultas) {
            System.out.println(String.format("Data e Hora: %s, Nutricionista: %s, Paciente: %s, Realizada: %s",
                    consulta.getDataHora(), consulta.getNomeNutricionista(), consulta.getNomePaciente(),
                    consulta.isConsultaRealizada() ? "Sim" : "Não"));
        }
    }

    private static void realizarConsulta() {
        System.out.print("ID da consulta: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Consulta consulta = ListaConsultas.buscarPorId(id);
        if (consulta != null) {
            consulta.setConsultaRealizada(true);
            System.out.println("Consulta realizada com sucesso!");
        } else {
            System.out.println("Consulta não encontrada.");
        }
    }
}
