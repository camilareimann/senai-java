package repositorio;

import entidades.Paciente;
import java.util.ArrayList;
import java.util.List;

public class ListaPacientes {
    private static List<Paciente> pacientes = new ArrayList<>();

    public static List<Paciente> listar() {
        return pacientes;
    }

    public static Paciente buscarPorId(int id) {
        if (id >= 0 && id < pacientes.size()) {
            return pacientes.get(id);
        }
        return null;
    }

    public static void adicionar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public static void remover(int id) {
        if (id >= 0 && id < pacientes.size()) {
            pacientes.remove(id);
        }
    }

    public static void alterar(int id, double peso, double altura, double pressaoArterial, double frequenciaCardiaca, String dietaAlimentar) {
        Paciente paciente = buscarPorId(id);
        if (paciente != null) {
            paciente.setPeso(peso);
            paciente.setAltura(altura);
            paciente.setPressaoArterial(pressaoArterial);
            paciente.setFrequenciaCardiaca(frequenciaCardiaca);
            paciente.setDietaAlimentar(dietaAlimentar);
        }
    }
}
