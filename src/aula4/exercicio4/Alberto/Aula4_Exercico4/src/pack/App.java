package pack;

import cargos.Analista;
import cargos.Diretor;
import cargos.Gerente;
import cargos.PJ;
import cargos.Tecnico;

public class App {

	public static void main(String[] args) {
		calcSalario pj = new PJ(25, 600);
		calcSalario tecnico = new Tecnico(15, 3200);
		calcSalario analista = new Analista(16, 4000);
		calcSalario gerente = new Gerente(20, 6000);
		calcSalario diretor = new Diretor(10000, 15000);

		System.out.println("Salário PJ: R$ " + pj.salario());
		System.out.println("Salário tecnico: R$ " + tecnico.salario());
		System.out.println("Salário analista: R$ " + analista.salario());
		System.out.println("Salário gerente: R$ " + gerente.salario());
		System.out.println("Salário diretor: R$ " + diretor.salario());

	}

}
