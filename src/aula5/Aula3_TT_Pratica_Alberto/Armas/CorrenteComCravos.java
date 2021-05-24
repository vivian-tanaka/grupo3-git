package Aula3_TT_Pratica_Alberto.Armas;

import Aula3_TT_Pratica_Alberto.Arma;

public class CorrenteComCravos extends Arma {

    @Override
    public void acao() {
        atacar();
    }

    private void atacar() {
        System.out.println("Ataca com corrente-com-cravos e causa dano tipo perfurante");
        System.out.println("Dano: " + (Math.round(Math.random()*10)+6));
        if (Math.random()*10 < 4){
            System.out.println("Prendeu o oponente na corrente");
        }
    }
}
