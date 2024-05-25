package entidades;

import java.util.ArrayList;
import java.util.List;

public class Nutricionista extends Funcionario {
    private List<String> certificacoes;
    private int numeroConsultas;
    private int tempoExperiencia;

    // Construtor completo
    public Nutricionista(String nome, int idade, Endereco endereco, double salario, List<String> certificacoes, int numeroConsultas, int tempoExperiencia) {
        super(nome, idade, endereco, salario);
        this.certificacoes = certificacoes;
        this.numeroConsultas = numeroConsultas;
        this.tempoExperiencia = tempoExperiencia;
    }

    // Construtor vazio
    public Nutricionista() {
        certificacoes = new ArrayList<>();
    }

    // Getters e Setters
    public List<String> getCertificacoes() {
        return certificacoes;
    }

    public void setCertificacoes(List<String> certificacoes) {
        this.certificacoes = certificacoes;
    }

    public int getNumeroConsultas() {
        return numeroConsultas;
    }

    public void setNumeroConsultas(int numeroConsultas) {
        this.numeroConsultas = numeroConsultas;
    }

    public int getTempoExperiencia() {
        return tempoExperiencia;
    }

    public void setTempoExperiencia(int tempoExperiencia) {
        this.tempoExperiencia = tempoExperiencia;
    }

    // Métodos adicionais
    public void adicionarAnoExperiencia() {
        this.tempoExperiencia++;
    }

    public void adicionarCertificacao(String certificacao) {
        this.certificacoes.add(certificacao);
    }
}
