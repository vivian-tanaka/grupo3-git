package aula4.poo.ex4.rayan.entities;

import aula4.poo.ex4.rayan.interfaces.PagadorSalario;

public class FuncionarioPJ extends Pessoa implements PagadorSalario {

    private double valorHora;
    private int qtdHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(int qtdHora) {
        this.qtdHora = qtdHora;
    }

    @Override
    public double pagarSalario() {
        return qtdHora * valorHora;
    }
}
