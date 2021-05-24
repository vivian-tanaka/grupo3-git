package aula4.exercicio4.vivian;

public abstract class Cargo {
    Double bonus;
    Double jornada;
    Double descanso;
    Double salario;
    Boolean isMetaBatida = false;
    Double lucroEmpresa;


    public Cargo(){

    }

    public Double getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(Double lucroEmpresa) {
        this.lucroEmpresa = lucroEmpresa;
    }

    public void setIsMetaBatida(Boolean isMetaBatida){
        this.isMetaBatida = isMetaBatida;
    }

    public abstract Double calcularSalario();
}
