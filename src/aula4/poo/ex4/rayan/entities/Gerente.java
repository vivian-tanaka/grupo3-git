package aula4.poo.ex4.rayan.entities;

import aula4.poo.ex4.rayan.interfaces.PagadorSalario;

public class Gerente extends FuncionarioPF implements PagadorSalario {

    private double bonusMetaBatida;

    public double getBonusMetaBatida() {
        return bonusMetaBatida;
    }

    public void setBonusMetaBatida(int qtdMetaBatida) {
        this.bonusMetaBatida = getSalario() * (1 + (qtdMetaBatida * 0.125));
    }

    @Override
    public double pagarSalario() {
        return getSalario() + getBonusMetaBatida();
    }
}
