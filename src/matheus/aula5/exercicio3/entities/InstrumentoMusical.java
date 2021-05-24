package matheus.aula5.exercicio3.entities;

public class InstrumentoMusical extends Arma{

    @Override
    public void acao() {
        tocarSomAmbiente();
        tocarSomDeDistracao();
    }

    public void tocarSomDeDistracao() {
        System.out.println("O som de distração começou a tocar e os inimigos estão distraídos.");
    }

    public void tocarSomAmbiente() {
        System.out.println("Um som ambiente está tocando, ninguém percebeu.");
    }
}
