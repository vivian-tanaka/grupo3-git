package aula4.exercicio4.vivian;

public class Tecnico extends Cargo{

    public Tecnico(){
        this.bonus = 1.05;
        this.descanso = 0.0;
        this.jornada = 40.0;
        this.salario = 3200.0;
    }

    @Override
    public Double calcularSalario() {
        if(isMetaBatida) return salario * bonus;

        return salario;
    }
}
