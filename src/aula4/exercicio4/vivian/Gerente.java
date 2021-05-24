package aula4.exercicio4.vivian;

public class Gerente extends Cargo{

    public Gerente(){
        this.bonus = 1.125;
        this.descanso = 4.0;
        this.jornada = 36.0;
        this.salario = 6000.0;
    }

    @Override
    public Double calcularSalario() {
        if(isMetaBatida) return salario * bonus;

        return salario;
    }
}
