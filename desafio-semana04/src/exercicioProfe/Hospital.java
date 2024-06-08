package exercicioProfe;

import java.util.HashMap;
import java.util.Map;

public class Hospital implements UserRepository {

    private Map<String, Pessoa> pacientes;

    public Hospital() {
        pacientes = new HashMap<>();
    }

    @Override
    public void adicionarUser(Pessoa pessoa) {
        if (pessoa != null && !pacientes.containsKey(pessoa.getNome())) {
            pacientes.put(pessoa.getNome(), pessoa);
        }
    }

    @Override
    public Pessoa buscarUser(String nome) {
        return pacientes.get(nome);
    }

    @Override
    public String listarUsers() {
        for (Pessoa p : pacientes.values()) {
            System.out.println(p);
        }
        return null;
    }
}
