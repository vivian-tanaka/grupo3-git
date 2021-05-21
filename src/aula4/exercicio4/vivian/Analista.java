package aula4.exercicio4.vivian;

public class Analista extends Cargo{

    public Analista(){
        this.bonus = 1.08;
        this.descanso = 4.0;
        this.jornada = 40.0;
        this.salario = 4000.0;
    }

    @Override
    public Double calcularSalario() {
        if(isMetaBatida) return salario * bonus;

        return salario;
    }
}
