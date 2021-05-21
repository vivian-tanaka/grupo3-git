package aula4.exercicio2.main;

import aula4.exercicio2.ContaCorrente;

public class Program {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(0, "Matheus");
        ContaCorrente cc2 = new ContaCorrente(500, "João");

        cc1.depositar(1000);
        cc1.sacar(500);
        cc1.transferir(cc2, 300);
        System.out.println(cc1);
        System.out.println(cc2);
        cc1.sacar(300);
    }
}
