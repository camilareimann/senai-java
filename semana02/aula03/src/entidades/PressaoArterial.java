package entidades;

public class PressaoArterial {
    public int sistolica;
    public int diastolica;

    public static void main(String[] args) {
        PressaoArterial pressao = new PressaoArterial();
        pressao.sistolica = 118;
        pressao.diastolica = 76;

        System.out.printf("Pressão Sistólica:" + pressao.sistolica + " mmHg%n" + "Pressão Diastólica:" + pressao.diastolica + " mmHg%n");
        boolean pressaoNormal = (pressao.sistolica >= 90 && pressao.sistolica <= 120) && (pressao.diastolica >= 60 && pressao.diastolica <= 80);
        System.out.println("Pressão dentro dos limites normais? " + pressaoNormal);
    }
}