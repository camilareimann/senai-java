package exercicioCami;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Paciente paciente1 = new Paciente("João", 20, 70, 1.80, 1);
        Paciente paciente2 = new Paciente("Maria", 25, 60, 1.70, 2);
        Paciente paciente3 = new Paciente("José", 30, 80, 2.0, 3);
        hospital.adicionarPaciente(paciente1);
        hospital.adicionarPaciente(paciente2);
        hospital.adicionarPaciente(paciente3);
        hospital.verPacientes();
        System.out.println(hospital.buscarPacientePorNome("Maria").getNome());
        System.out.println(hospital.buscarPacientePorId(3).getNome());
    }
}
