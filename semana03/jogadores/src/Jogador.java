import java.util.Date;

public class Jogador {
    private int id;
    private String nome;
    private String apelido;
    private Date dataNascimento;
    private int numeroCamisa;
    private String posicao;
    private int qualidade;
    private int cartaoAmarelo;
    private int cartaoVermelho;
    private boolean suspenso;

    public Jogador(int id, String nome, String apelido, Date dataNascimento, int numeroCamisa, String posicao, int qualidade, int cartaoAmarelo, int cartaoVermelho) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartaoAmarelo = cartaoAmarelo;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = isSuspenso();
    }

    public boolean isSuspenso() {
        return cartaoVermelho > 0 || cartaoAmarelo > 2;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getCartaoAmarelo() {
        return cartaoAmarelo;
    }

    public void setCartaoAmarelo(int cartaoAmarelo) {
        this.cartaoAmarelo = cartaoAmarelo;
        this.suspenso = isSuspenso();
    }

    public int getCartaoVermelho() {
        return cartaoVermelho;
    }

    public void setCartaoVermelho(int cartaoVermelho) {
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = isSuspenso();
    }

    public boolean isSuspensoStatus() {
        return suspenso;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id= " + id +
                ", nome= '" + nome + '\'' +
                ", apelido= '" + apelido + '\'' +
                ", dataNascimento= " + dataNascimento +
                ", numeroCamisa= " + numeroCamisa +
                ", posicao=' " + posicao + '\'' +
                ", qualidade= " + qualidade +
                ", cartaoAmarelo= " + cartaoAmarelo +
                ", cartaoVermelho= " + cartaoVermelho +
                ", condição: " + (suspenso ? "SUSPENSO" : "TA PRA JOGO") +
                '}';
    }
}
