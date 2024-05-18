package entidades;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double pressaoArterial;
    private double frequenciaCardiaca;
    private String dietaAlimentar;
    private List<String> atividadesFisicas;

    // Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(double pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public double getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(double frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setDietaAlimentar(String dietaAlimentar) {
        this.dietaAlimentar = dietaAlimentar;
    }

    public List<String> getAtividadesFisicas() {
        return atividadesFisicas;
    }

    public void setAtividadesFisicas(List<String> atividadesFisicas) {
        this.atividadesFisicas = atividadesFisicas;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para monitorar o paciente
    public String monitoramentoPaciente() {
        return String.format(
                "Nome: %s\nIdade: %d\nPeso: %.2f\nAltura: %.2f\nPressão Arterial: %.2f\nFrequência Cardíaca: %.2f\nDieta Alimentar: %s\nAtividades Físicas: %s\nIMC: %.2f",
                nome, idade, peso, altura, pressaoArterial, frequenciaCardiaca, dietaAlimentar, atividadesFisicas != null ? atividadesFisicas.toString() : "Nenhuma", calcularIMC());
    }

    // Método para registrar atividades físicas
    public void registrarAtividadeFisica(String atividade) {
        if (atividadesFisicas == null) {
            atividadesFisicas = new ArrayList<>();
        }
        atividadesFisicas.add(atividade);
    }
}
