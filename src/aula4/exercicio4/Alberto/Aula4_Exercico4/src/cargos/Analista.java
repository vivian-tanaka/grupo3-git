package cargos;

import pack.calcSalario;

public class Analista extends calcSalario{
	private double metasBatidas;
	private double salarioBase;
	
	public Analista(double metasBatidas, double salarioBase) {
		this.metasBatidas = metasBatidas;
		this.salarioBase = salarioBase;
	}

	public double getMetasBatidas() {
		return metasBatidas;
	}

	public void setMetasBatidas(double metasBatidas) {
		this.metasBatidas = metasBatidas;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public double salario() {
		return salarioBase*(1+metasBatidas*0.08);
	}

}
