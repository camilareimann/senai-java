package entidades;

import java.util.ArrayList;

public class RegistroSono {
    public ArrayList<String> registrosSono = new ArrayList<>();

    public static void main(String[] args) {
        RegistroSono registroSono = new RegistroSono();
        registroSono.registrosSono.add("Horas: 7, Qualidade: Boa");
        registroSono.registrosSono.add("Horas: 6, Qualidade: Regular");
        System.out.println("Registros de Sono: " + registroSono.registrosSono);
    }
}