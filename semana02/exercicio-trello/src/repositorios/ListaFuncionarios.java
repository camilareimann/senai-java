package repositorios;

import entidades.Funcionario;
import entidades.Endereco;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionarios {
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public static List<Funcionario> listar() {
        return funcionarios;
    }

    public static Funcionario buscarPorId(int id) {
        if (id >= 0 && id < funcionarios.size()) {
            return funcionarios.get(id);
        }
        return null;
    }

    public static void adicionar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void remover(int id) {
        if (id >= 0 && id < funcionarios.size()) {
            funcionarios.remove(id);
        }
    }

    public static void alterar(int id, String nome, int idade, Endereco endereco, double salario) {
        Funcionario funcionario = buscarPorId(id);
        if (funcionario != null) {
            funcionario.setNome(nome);
            funcionario.setIdade(idade);
            funcionario.setEndereco(endereco);
            funcionario.setSalario(salario);
        }
    }
}