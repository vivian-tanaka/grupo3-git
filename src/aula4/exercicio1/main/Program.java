package aula4.exercicio1.main;

import aula4.exercicio1.entities.Disciplina;
import aula4.exercicio1.entities.Estudante;
import aula4.exercicio1.entities.Turma;

public class Program {
    public static void main(String[] args) {

        Estudante e1 = new Estudante("Ana", 12, 1234, "7");
        Estudante e2 = new Estudante("João", 15, 1236, "9");
        Estudante e3 = new Estudante("Vitor", 11, 1238, "7");

        Disciplina d1 = new Disciplina("Biologia", 40);
        Disciplina d2 = new Disciplina("Matemática", 80);

        Turma t1 = new Turma("7", "C");
        Turma t2 = new Turma("9", "A");

        t1.addEstudante(e1);
        t1.addEstudante(e3);
        t2.addEstudante(e2);
        t1.addDisciplina(d1);
        t1.addDisciplina(d2);
        t2.addDisciplina(d1);
        t2.addDisciplina(d2);

    }
}
