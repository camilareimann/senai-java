package projeto;

public enum Operacao {
    ADICIONAR(1),
    LISTAR(2),
    SAIR(0);

    private int codigo;

    Operacao(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static Operacao fromCodigo(int codigo) {
        for (Operacao operacao : Operacao.values()) {
            if (operacao.getCodigo() == codigo) {
                return operacao;
            }
        }
        return null;
    }
}