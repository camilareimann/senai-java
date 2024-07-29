package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevMedicoAplicacao {
    private List<Medico> medicos;
    private MedicoCLI cli;

    public DevMedicoAplicacao() {
        medicos = new ArrayList<>();
        cli = new MedicoCLI();
    }

    public void executar() {
        Operacao operacao;
        do {
            cli.exibirMenu();
            operacao = cli.obterOperacao();
            if (operacao != null) {
                executarOperacao(operacao);
            } else {
                System.out.println("Operação inválida! Tente novamente.");
            }
        } while (operacao != Operacao.SAIR);
    }

    private void executarOperacao(Operacao operacao) {
        switch (operacao) {
            case ADICIONAR:
                Medico medico = cli.obterDadosMedico();
                medicos.add(medico);
                System.out.println("Médico adicionado com sucesso!");
                break;
            case LISTAR:
                cli.listarMedicos(medicos);
                break;
            case SAIR:
                System.out.println("Sistema encerrado.");
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}