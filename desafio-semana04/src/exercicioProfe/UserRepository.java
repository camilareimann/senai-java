package exercicioProfe;

public interface UserRepository {

    void adicionarUser(Pessoa pessoa);
    Pessoa buscarUser(String nome);
    String listarUsers();
}
