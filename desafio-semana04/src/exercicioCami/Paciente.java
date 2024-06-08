package exercicioCami;

public class Paciente {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private int id;

    public Paciente() {
    }

    public Paciente(String nome, int idade, double peso, double altura, int id) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
        this.id = id;
    }

    //Criar métodos getters e setters para todas as variáveis de instância.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade inválida");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0 && peso < 500) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("Peso inválido");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 3.0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("Altura inválida");
        }
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public int getId() {
        return id;
    }
}
