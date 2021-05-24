package Aula3_TT_Pratica_Alberto.Armas;

import Aula3_TT_Pratica_Alberto.Arma;

public class Lança extends Arma {

    @Override
    public void acao(){
        acao1();
    }

    public void acao1(){
        System.out.println("Ataca com lança e causa dano tipo perfurante");
        System.out.println("Dano: " + (Math.round(Math.random()*10)+6));
    }

}