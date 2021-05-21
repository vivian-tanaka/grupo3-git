package matheus.exercicio4.entities;

public enum Cargo {

    TECNICO(5.0, 40, 0, 3200.0, 0),
    ANALISTA(8.0,40,4.0,4000.0, 0),
    GERENTE(12.5, 36, 4, 6000.0, 0),
    DIRETOR(0, 0, 0, 15000.0, 3.0);

    private double bonificacao;
    private int horasSemanaisDefinidas;
    private double horasDeDescanso;
    private double salario;
    private double participacaoDosLucros;

    Cargo(double bonificacao, int horasSemanaisDefinidas, double horasDeDescanso, double salario, double participacaoDosLucros) {
        this.bonificacao = bonificacao;
        this.horasSemanaisDefinidas = horasSemanaisDefinidas;
        this.horasDeDescanso = horasDeDescanso;
        this.salario = salario;
        this.participacaoDosLucros = participacaoDosLucros;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public int getHorasSemanaisDefinidas() {
        return horasSemanaisDefinidas;
    }

    public double getHorasDeDescanso() {
        return horasDeDescanso;
    }

    public double getSalario() {
        return salario;
    }

    public double getParticipacaoDosLucros() {
        return participacaoDosLucros;
    }
}
