package exercicioCami;

import java.util.ArrayList;
import java.util.List;
public class Hospital {
        private List<Paciente> pacientes;

        public Hospital() {
            this.pacientes = new ArrayList<>();
        }

        public void adicionarPaciente(Paciente paciente) {
            pacientes.add(paciente);
        }

        public Paciente buscarPacientePorNome(String nome) {
            for (Paciente paciente : pacientes) {
                if (paciente.getNome().equalsIgnoreCase(nome)) {
                    return paciente;
                }
            }
            return null;
        }

        public Paciente buscarPacientePorId(int id) {
            for (Paciente paciente : pacientes) {
                if (paciente.getId() == id) {
                    return paciente;
                }
            }
            return null;
        }

    public void verPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente.getNome());
        }
    }

}
