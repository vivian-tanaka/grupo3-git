package aula4.exercicio4.vivian;

public abstract class Funcionario {
    String nome;
    Double horasTrabalhadas;
    CargoEnum cargo;

    public Funcionario(){

    }

    public abstract Double pagarSalario();

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
