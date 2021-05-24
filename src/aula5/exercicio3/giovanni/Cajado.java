package aula5.exercicio3.giovanni;

public class Cajado extends Arma{

    public Cajado(String name, int ataque) {
        this.name = name;
        this.ataque = ataque;
    }

    @Override
    String atacar(Personagem p1, Personagem p2) {
        int dano = 0;
        if(p1.getClasse() == ClassePersonagem.MAGO){
            p2.setPontosDeVida(p2.getPontosDeVida() - this.ataque * 2);
            dano = this.ataque * 2;
        } else{
            p2.setPontosDeVida(p2.getPontosDeVida() - this.ataque);
            dano = this.ataque;
        }
        return "O seu personagem evocou uma magia com o seu cajado contra o adversário e agora o HP dele é de "
                + p2.getPontosDeVida() + " (menos " + dano + " pontos)";
    }
}
