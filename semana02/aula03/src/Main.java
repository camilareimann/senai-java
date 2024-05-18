import entidades.Paciente;
import entidades.PressaoArterial;
import entidades.RegistroSono;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando um paciente
        Paciente paciente = new Paciente();
        paciente.nome = "Ana Oliveira";
        paciente.idade = 29;
        paciente.altura = 1.65;
        paciente.peso = 60;
        paciente.historicoMedico.add("Vacinação contra a gripe");

        // Registrando pressão
        PressaoArterial pressao = new PressaoArterial();
        pressao.sistolica = 110;
        pressao.diastolica = 70;
        paciente.historicoMedico.add(String.format("Pressão Sistólica: " + pressao.sistolica + " - Pressão Diastólica: " +  pressao.diastolica));

        // Registrando sono
        RegistroSono registroSono = new RegistroSono();
        registroSono.registrosSono.add("Horas: 8, Qualidade: Excelente");
        registroSono.registrosSono.add("Horas: 6, Qualidade: Regular");
        paciente.historicoMedico.add("Registros de sono: " + registroSono.registrosSono);

        // Exibindo
        System.out.printf("Nome: " + paciente.nome);
        System.out.printf("\nIdade: " + paciente.idade);
        System.out.printf("\nIMC: " + paciente.calcularIMC());
        System.out.println("\nHistórico Médico: " + paciente.historicoMedico);
    }
}