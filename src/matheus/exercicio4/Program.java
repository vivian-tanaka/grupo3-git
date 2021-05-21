package matheus.exercicio4;

import matheus.exercicio4.entities.Cargo;
import matheus.exercicio4.entities.Funcionario;
import matheus.exercicio4.entities.FuncionarioCLT;
import matheus.exercicio4.entities.FuncionarioPJ;

public class Program {

    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioCLT(Cargo.ANALISTA, 2, 1000);
        Funcionario f2 = new FuncionarioCLT(Cargo.DIRETOR, 1, 1000);
        Funcionario f3 = new FuncionarioCLT(Cargo.GERENTE, 1, 1000);
        Funcionario f4 = new FuncionarioCLT(Cargo.TECNICO, 3, 1000);
        Funcionario f5 = new FuncionarioPJ(10.0, 40.0);

        f1.pagarSalario();
        f2.pagarSalario();
        f3.pagarSalario();
        f4.pagarSalario();
        f5.pagarSalario();

        System.out.println(f1.getSalarioPago());
        System.out.println(f2.getSalarioPago());
        System.out.println(f3.getSalarioPago());
        System.out.println(f4.getSalarioPago());
        System.out.println(f5.getSalarioPago());
    }
}
