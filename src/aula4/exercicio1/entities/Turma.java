package aula4.exercicio1.entities;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String serie;
    private String codigo;
    private List<Estudante> estudanteList;
    private List<Disciplina> disciplinaList;

    public Turma(String serie, String codigo) {
        this.serie = serie;
        this.codigo = codigo;
        this.estudanteList = new ArrayList<>();
        this.disciplinaList = new ArrayList<>();
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void addEstudante(Estudante e){
        this.estudanteList.add(e);
    }

    public void addDisciplina(Disciplina d){
        this.disciplinaList.add(d);
    }

}
