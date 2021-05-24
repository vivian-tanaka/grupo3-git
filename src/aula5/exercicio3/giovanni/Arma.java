package aula5.exercicio3.giovanni;

public abstract class Arma {

    protected String name;
    protected Integer ataque;

    abstract String atacar(Personagem p1, Personagem p2);
}
