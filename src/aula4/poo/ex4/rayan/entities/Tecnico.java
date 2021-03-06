package aula4.poo.ex4.rayan.entities;

import aula4.poo.ex4.rayan.interfaces.PagadorSalario;

public class Tecnico extends FuncionarioPF implements PagadorSalario {

    private double bonusMetaBatida;

    public Tecnico(double salario, String cpf, String nome) {
        super.setSalario(salario);
        super.setCpf(cpf);
        super.setNome(nome);
    }

    public double getBonusMetaBatida() {
        return bonusMetaBatida;
    }

    public void setBonusMetaBatida(int qtdMetaBatida) {
        this.bonusMetaBatida = qtdMetaBatida * 0.05;
    }

    @Override
    public double pagarSalario() {
        return getSalario() + getBonusMetaBatida();
    }
}
