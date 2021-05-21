package matheus.exercicio4.entities;

public abstract class Funcionario {

    private double salarioPago;

    public abstract void pagarSalario();

    public double getSalarioPago() {
        return salarioPago;
    }

    public void setSalarioPago(double salarioPago) {
        this.salarioPago = salarioPago;
    }
}
