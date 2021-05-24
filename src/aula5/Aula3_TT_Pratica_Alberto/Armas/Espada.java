package Aula3_TT_Pratica_Alberto.Armas;

import Aula3_TT_Pratica_Alberto.Arma;

public class Espada extends Arma {

    @Override
    public void acao() {
        acao1();
    }

    public void acao1(){
        System.out.println("Ataca com espada e causa dano tipo cortante");
        System.out.println("Dano: " + (Math.round(Math.random()*10)+6));
    }
}
