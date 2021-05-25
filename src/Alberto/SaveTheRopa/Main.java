package Aula6.Alberto.SaveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // inicializa roupas
        Vestuario roupa1 = new Vestuario("Camiseta", "Polo");
        Vestuario roupa2 = new Vestuario("Calça", "NSK");
        // inicializa guarda roupa
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        // cria lista de roupas
        ArrayList<Vestuario> lista1 = new ArrayList<>();
        lista1.add(roupa1);
        lista1.add(roupa2);

        // adiciona lista ao guardaroupa
        guardaRoupa.addAoGuardaRoupa(lista1);

        // mostra a chave
        int key = guardaRoupa.guardarVestuario(lista1);
        System.out.println(key);

        // devolve as roupas
        List<Vestuario> lista2 = guardaRoupa.devolverVestuario(key);

        for (Vestuario roupa : lista2) {
            System.out.println(roupa.getModelo() + " " + roupa.getMarca());
        }
    }
}
