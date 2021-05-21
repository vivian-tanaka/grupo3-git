package matheus.exercicio4.entities;

public class FuncionarioPJ extends Funcionario{

    private double horasTrabalhadas;
    private double salarioPorHora;

    @Override
    public void pagarSalario() {
        this.setSalarioPago(horasTrabalhadas * salarioPorHora);
    }

    public FuncionarioPJ(double horasTrabalhadas, double salarioPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }
}
