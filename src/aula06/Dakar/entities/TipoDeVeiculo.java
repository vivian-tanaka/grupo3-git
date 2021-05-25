package aula06.Dakar.entities;

public enum TipoDeVeiculo {

    CARRO(4, 1000.0, 10),
    MOTO(2, 300.0, 20);

    private int quantidadeDeRodas;
    private double peso;
    private double chanceDeQuebrar;

    TipoDeVeiculo(int quantidadeDeRodas, double peso, double chanceDeQuebrar) {
        this.quantidadeDeRodas = quantidadeDeRodas;
        this.peso = peso;
        this.chanceDeQuebrar = chanceDeQuebrar;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getChanceDeQuebrar() {
        return chanceDeQuebrar;
    }

    public void setChanceDeQuebrar(double chanceDeQuebrar) {
        this.chanceDeQuebrar = chanceDeQuebrar;
    }
}
