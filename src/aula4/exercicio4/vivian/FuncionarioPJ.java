package aula4.exercicio4.vivian;

public class FuncionarioPJ extends Funcionario{

    Double valorHora;

    public FuncionarioPJ(String nome, Double valorHora){
        this.valorHora = valorHora;
        this.nome = nome;
    }

    @Override
    public Double pagarSalario() {
        return valorHora * horasTrabalhadas;
    }
}
