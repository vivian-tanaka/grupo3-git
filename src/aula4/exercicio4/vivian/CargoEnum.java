package aula4.exercicio4.vivian;

public enum CargoEnum {

    TECNICO(1,new Tecnico()),
    ANALISTA(2, new Analista()),
    GERENTE(3, new Gerente()),
    DIRETOR(4, new Diretor());

    private Cargo cargo;
    private Integer id;


    CargoEnum(Integer id, Cargo cargo) {
        this.id = id;
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Integer getId() {
        return id;
    }
}
