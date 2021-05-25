package Alberto.Dakar.main;

import Alberto.Dakar.entities.Corrida;
import Alberto.Dakar.entities.TipoDeVeiculo;
import Alberto.Dakar.entities.Veiculo;

public class Program {

    public static void main(String[] args) {
        Corrida corrida = new Corrida(100.0, 10000.0, "Corrida maluca", 7);

        corrida.registrarVeiculo(75.0, 11.0, 3.0, "XPTO003", TipoDeVeiculo.MOTO, 0);
        corrida.registrarVeiculo(65.0, 8.0, 3.0, "XPTO002", TipoDeVeiculo.CARRO, 0);
        corrida.registrarVeiculo(100.0, 10.0, 3.0, "XPTO001", TipoDeVeiculo.CARRO, 0);
        corrida.registrarVeiculo(120.0, 6.5, 3.0, "XPTO004", TipoDeVeiculo.MOTO, 0);
        corrida.registrarVeiculo(100.0, 7.5, 3.0, "XPTO005", TipoDeVeiculo.MOTO, 0);

        corrida.iniciarCorrida();
    }
}