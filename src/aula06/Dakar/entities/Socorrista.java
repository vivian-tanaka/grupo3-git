package aula06.Dakar.entities;

public class Socorrista {

    public void socorrer(Veiculo veiculo){
        System.out.println("Socorrendo " + veiculo.getTipoDeVeiculo().toString() + " de placa " + veiculo.getPlaca());
    }

    public void socorrer(String placa) {

    }
}
