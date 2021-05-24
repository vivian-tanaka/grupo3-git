package aula4.poo.ex4.rayan.entities;

import aula4.poo.ex4.rayan.interfaces.PagadorSalario;

public class Diretor extends FuncionarioPF implements PagadorSalario {

    private double participacaoLucros;

    public Diretor(double salario, String cpf, String nome) {
        super.setSalario(salario);
        super.setCpf(cpf);
        super.setNome(nome);
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double lucro) {
        this.participacaoLucros = 0.3 * lucro;
    }

    @Override
    public double pagarSalario() {
        return getSalario() + getParticipacaoLucros();
    }
}
