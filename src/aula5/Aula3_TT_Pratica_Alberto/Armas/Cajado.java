package Aula3_TT_Pratica_Alberto.Armas;

import Aula3_TT_Pratica_Alberto.Arma;

public class Cajado extends Arma {

    @Override
    public void acao() {
        bater();
    }

    private void bater() {
        System.out.println("Ataca com lança e causa dano tipo concussão");
        System.out.println("Dano: " + (Math.round(Math.random()*6)+5));
    }
}
