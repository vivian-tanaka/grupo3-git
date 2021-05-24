package matheus.aula5.exercicio3.entities;

public class Espada extends Arma {

    @Override
    public void acao() {
        darUmaEspadada();
    }

    public void darUmaEspadada() {
        System.out.println("Uma espadada foi desferida!");
    }
}
