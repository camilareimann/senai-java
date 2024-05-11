import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> pacientes = new ArrayList<>();
        ArrayList<String> pacientesTeste = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("nome do " + (i + 1) + "º Paciente: ");
            pacientes.add(scanner.nextLine());
        }

        System.out.println("\nLista de pacientes:");
        for (String paciente : pacientes) {
            System.out.println(paciente);
        }

        pacientesTeste.add("Camila");
        pacientesTeste.add("Maria");

        pacientes.removeAll(pacientesTeste);

        System.out.println("\nLista de pacientes após remoção:");
        for (String paciente : pacientes) {
            System.out.println(paciente);
        }

        scanner.close();
    }
}
