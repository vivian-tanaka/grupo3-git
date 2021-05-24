package aula4.exercicio4.vivian;

public class Diretor extends Cargo{
    Double plr;

    public Diretor(){
        this.salario = 13000.0;
        this.plr = 1.03;
    }

    @Override
    public Double calcularSalario() {
        return salario + (lucroEmpresa*plr);
    }
}
