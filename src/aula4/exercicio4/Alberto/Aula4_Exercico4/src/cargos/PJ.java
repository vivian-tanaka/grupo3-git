package cargos;

import pack.calcSalario;

public class PJ extends calcSalario{
	private double salarioPorHora;
	private double horasTrabalhadas;

	@Override
	public double salario() {
		return salarioPorHora*horasTrabalhadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public PJ(double salarioPorHora, double horasTrabalhadas) {
		super();
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
}
