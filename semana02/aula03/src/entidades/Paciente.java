package entidades;

import java.util.ArrayList;

public class Paciente {
    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public ArrayList<String> historicoMedico;

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }


    public Paciente() {
        // other initializations...
        this.historicoMedico = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Criando um paciente
        Paciente paciente = new Paciente();
        paciente.nome = "Ana Oliveira";
        paciente.idade = 29;
        paciente.altura = 1.65;
        paciente.peso = 60;
        paciente.historicoMedico = new ArrayList<>();
        paciente.historicoMedico.add("Vacinação contra a gripe");

        // Exibindo
        System.out.printf("Nome: " + paciente.nome);
        System.out.printf("\nIdade: " + paciente.idade);
        System.out.printf("\nIMC: " + paciente.calcularIMC());
        System.out.println("\nHistórico Médico: " + paciente.historicoMedico);
    }

}
