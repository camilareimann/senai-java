import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    private static List<Pessoa> listaPessoas = new ArrayList<>();

    public static List<Pessoa> listarPessoas() {
        return listaPessoas;
    }
    public static void adicionarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        pessoa1.nome = "Ana";
        pessoa1.idade = 29;
        pessoa2.nome = "João";
        pessoa2.idade = 35;
        adicionarPessoa(pessoa1);
        adicionarPessoa(pessoa2);

        List<Pessoa> pessoas = listarPessoas();
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}