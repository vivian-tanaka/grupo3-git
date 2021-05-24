package matheus.aula5.exercicio3.entities;

public class Machado extends Arma{

    @Override
    public void acao() {
        darUmaMachadada();
    }

    private void darUmaMachadada() {
        System.out.println("Uma machadada foi desferida!");
    }
}
