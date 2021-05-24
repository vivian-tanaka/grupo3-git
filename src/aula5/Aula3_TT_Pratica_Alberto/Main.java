package Aula3_TT_Pratica_Alberto;

import Aula3_TT_Pratica_Alberto.Armas.*;
import Aula3_TT_Pratica_Alberto.Classes.Classe;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Vamos desenvolver um sistema de equipamentos para um jogo que a nossa equipe está desenvolvendo.

        Inicialmente vamos criar uma classe para o nosso personagem principal.
        Esta deve ter nome, classe (guerreiro, mago, arqueiro e o que mais a
        imaginação mandar) e nível, além de possuir um slot para carregar uma arma.

        Devemos criar uma estrutura que permita acoplar ao nosso personagem principal
        qualquer arma existente no jogo.

        Devemos também criar ao menos três armas (espada, arco e flecha, etc) com
        funcionalidades diferentes para executar os testes.
        Ordenar as armas por ordem alfabética.

        Requisito de completude: Executar o programa e trocar entre as 3 armas,
        executar todas as funcionalidades de cada uma delas e finalizar o programa sem erros.

         */

        Personagem personagem = new Personagem("Kim", 1, 5, Classe.MAGO, new Arco());
        personagem.realizarAcao();
        Personagem personagem1 = new Personagem("Arty", 6, 70, Classe.KENSEI ,new Espada() );
        personagem1.realizarAcao();
        personagem1.setArma(new CorrenteComCravos());
        personagem1.realizarAcao();
        personagem1.setArma(new Arco());
        personagem1.realizarAcao();
        personagem1.setArma(new Lança());
        personagem1.realizarAcao();
        personagem1.setArma(new Cajado());
        personagem1.realizarAcao();


        // armas em ordem alfabetica
        Arma[] listaArmas = {new Espada(), new Cajado(), new Arco(), new CorrenteComCravos(), new Lança()};
        // lista com nome das armas
        String[] nomes = new String[listaArmas.length];
        // preencher nomes
        for (int i = 0; i < listaArmas.length; i++){
            // le o nome da classe da arma
            nomes[i] = listaArmas[i].getClass().getSimpleName();
        }

        Arrays.sort(nomes);

        for (String aNome : nomes) {
            System.out.println(aNome);
        }

    }
}
