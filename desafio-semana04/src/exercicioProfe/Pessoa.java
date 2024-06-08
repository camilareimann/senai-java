package exercicioProfe;

public abstract class Pessoa {

    private Integer id;
    private String nome;
    private Integer idade;

    public Pessoa() {}

    public Pessoa(Integer id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        if(idade > 0 && idade < 130){
            this.idade = idade;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade > 0 && idade < 130){
            this.idade = idade;
        }
    }




    @Override
    public String toString() {
        return "Id = " + id + "\nNome = " + nome + "\nIdade = " + idade;
    }
}
