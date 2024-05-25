package repositorios;

import entidades.Consulta;
import entidades.Nutricionista;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaConsultas {
    private static List<Consulta> consultas = new ArrayList<>();

    public static List<Consulta> listar() {
        return consultas;
    }

    public static Consulta buscarPorId(int id) {
        if (id >= 0 && id < consultas.size()) {
            return consultas.get(id);
        }
        return null;
    }

    public static void adicionar(Consulta consulta, Nutricionista nutricionista) {
        consultas.add(consulta);
        nutricionista.setNumeroConsultas(nutricionista.getNumeroConsultas() + 1);
    }

    public static void remover(int id) {
        if (id >= 0 && id < consultas.size()) {
            consultas.remove(id);
        }
    }

    public static void alterar(int id, LocalDateTime dataHora, boolean consultaRealizada) {
        Consulta consulta = buscarPorId(id);
        if (consulta != null) {
            consulta.setDataHora(dataHora);
            consulta.setConsultaRealizada(consultaRealizada);
        }
    }
}
