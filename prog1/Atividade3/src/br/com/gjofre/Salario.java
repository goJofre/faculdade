package br.com.gjofre;

public class Salario {

	private SalarioFamilia salarioFamilia = new SalarioFamilia();
	private double valorBase;
	
	public Salario(double valorBase, int qtdDependentes) {
		this.valorBase  = valorBase;
		salarioFamilia.setQuantidadeDependentes(qtdDependentes); 
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setSalario(double valorBase) {
		this.valorBase = valorBase;
	}

	private double calcularSalarioBruto() {
		double valor = salarioFamilia.calcularSalarioFamilia(); 
		return valor > 0.0 ? (getValorBase() + valor) * (1 + 0.03) : getValorBase();			
	}
	
	@Override
	public String toString() {
		return "Salário: " + getValorBase() + "\n" +
				"Quantidade de dependentes: " + salarioFamilia.getQuantidadeDependentes() + "\n" +
				"Tota do salário família: " + salarioFamilia.calcularSalarioFamilia() + "\n" +
				"Salário final: " + calcularSalarioBruto() + "\n" +
				"-------------" + "\n";
	}
}