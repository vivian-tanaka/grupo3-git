package aula4.poo.ex4.rayan.entities;

import aula4.poo.ex4.rayan.interfaces.PagadorSalario;

public class Analista extends FuncionarioPF implements PagadorSalario {

    private double bonusMetaBatida;

    public Analista(double salario, String cpf, String nome) {
        super.setSalario(salario);
        super.setCpf(cpf);
        super.setNome(nome);
    }
    public double getBonusMetaBatida() {
        return bonusMetaBatida;
    }

    public void setBonusMetaBatida(int qtdMetaBatida) {
        this.bonusMetaBatida = getSalario() * (qtdMetaBatida * 0.08);
    }

    @Override
    public double pagarSalario() {
        return getSalario() + getBonusMetaBatida();
    }
}