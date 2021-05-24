package cargos;

import pack.calcSalario;

public class Diretor extends calcSalario{
	private double lucros;
	private double salarioBase;
	
	public Diretor(double metasBatidas, double salarioBase) {
		this.lucros = metasBatidas;
		this.salarioBase = salarioBase;
	}

	public double getMetasBatidas() {
		return lucros;
	}

	public void setMetasBatidas(double metasBatidas) {
		this.lucros = metasBatidas;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double salario() {
		return salarioBase*(1+(lucros*0.03));
	}

}
