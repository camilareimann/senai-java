package repositorios;

import entidades.Nutricionista;
import entidades.Endereco;

import java.util.ArrayList;
import java.util.List;

public class ListaNutricionistas {
    private static List<Nutricionista> nutricionistas = new ArrayList<>();

    public static List<Nutricionista> listar() {
        return nutricionistas;
    }

    public static Nutricionista buscarPorId(int id) {
        if (id >= 0 && id < nutricionistas.size()) {
            return nutricionistas.get(id);
        }
        return null;
    }

    public static Nutricionista buscarPorNome(String nome) {
        for (Nutricionista nutricionista : nutricionistas) {
            if (nutricionista.getNome().equalsIgnoreCase(nome)) {
                return nutricionista;
            }
        }
        return null;
    }

    public static void adicionar(Nutricionista nutricionista) {
        if (buscarPorNome(nutricionista.getNome()) == null) {
            nutricionistas.add(nutricionista);
        } else {
            System.out.println("Nutricionista com nome duplicado não pode ser adicionado.");
        }
    }

    public static void remover(int id) {
        if (id >= 0 && id < nutricionistas.size()) {
            nutricionistas.remove(id);
        }
    }

    public static void alterar(int id, String nome, int idade, Endereco endereco, double salario, List<String> certificacoes, int numeroConsultas, int tempoExperiencia) {
        Nutricionista nutricionista = buscarPorId(id);
        if (nutricionista != null) {
            nutricionista.setNome(nome);
            nutricionista.setIdade(idade);
            nutricionista.setEndereco(endereco);
            nutricionista.setSalario(salario);
            nutricionista.setCertificacoes(certificacoes);
            nutricionista.setNumeroConsultas(numeroConsultas);
            nutricionista.setTempoExperiencia(tempoExperiencia);
        }
    }
}