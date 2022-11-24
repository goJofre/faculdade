package br.com.gjofre;

import java.util.ArrayList;

public class Salario {

	private SalarioFamilia salarioFamilia = new SalarioFamilia();
	private double salario;
	private double salarioTotal;
	
	public Salario(double salario, int qtdDependentes) {
		this.salario = salario;
		salarioFamilia.setQuantidadeDependentes(qtdDependentes); 
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public SalarioFamilia getSalarioFamilia() {
		return salarioFamilia;
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	
	private void calcularSalarioTotal() {
		double salarioTotal = getSalario() + salarioFamilia.getValorSalarioFamilia();
		setSalarioTotal(salarioTotal);
	}
	
	public void calcularValoresSalario() {
		salarioFamilia.calcularPercentualAcrescimo();
		salarioFamilia.calcularSalarioFamilia();
		calcularSalarioTotal();
	}	
	
	
	@Override
	public String toString() {
		return "Salário: " + getSalario() + "\n" +
				"Quantidade de dependentes: " + salarioFamilia.getQuantidadeDependentes() + "\n" +
				"Tota do salário família: " + salarioFamilia.getValorSalarioFamilia() + "\n" +
				"Salário final: " + getSalarioTotal() + "\n" +
				"-------------" + "\n";
	}
}