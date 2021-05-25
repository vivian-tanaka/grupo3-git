package Alberto.Dakar.entities;

public class Veiculo {

    private double velocidade;
    private double aceleracao;
    private double anguloDeGiro;
    private String placa;
    private TipoDeVeiculo tipoDeVeiculo;
    private double velocidadeCorrente;



    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, TipoDeVeiculo tipoDeVeiculo, double velocidadeCorrente) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.tipoDeVeiculo = tipoDeVeiculo;
        this.velocidadeCorrente = velocidadeCorrente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoDeVeiculo getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(TipoDeVeiculo tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public double getVelocidadeCorrente() {
        return velocidadeCorrente;
    }

    public void setVelocidadeCorrente(double velocidadeCorrente) {
        this.velocidadeCorrente = velocidadeCorrente;
    }
}
