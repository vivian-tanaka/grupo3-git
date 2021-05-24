package matheus.aula5.exercicio3;

import matheus.aula5.exercicio3.entities.*;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        PersonagemPrincipal pp = new PersonagemPrincipal("Matheus", Classe.BARDO, new InstrumentoMusical());
        pp.realizaAcaoArma();

        Arma [] armas = {new Espada(), new InstrumentoMusical(), new ArcoEFlecha(), new Machado()};
        String [] nomeDasArmas = new String[armas.length];

        for (int i = 0; i < armas.length; i++) {
            nomeDasArmas[i] = armas[i].getClass().getSimpleName();
        }

        Arrays.sort(nomeDasArmas);
        Arrays.stream(nomeDasArmas).forEach(System.out::println);
    }

}
