package aula4.exercicio4.vivian;

public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT(String nome, CargoEnum cargoEnum) {
        this.nome = nome;
        this.cargo = cargoEnum;
    }

    @Override
    public Double pagarSalario() {
        return cargo.getCargo().calcularSalario();
    }
}
