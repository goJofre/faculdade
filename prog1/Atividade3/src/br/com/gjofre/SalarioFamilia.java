package br.com.gjofre;

public class SalarioFamilia {
	
	private static double VALOR_POR_DEPENDENTE = 134.98;
	private static double PERCENTUAL_ACRESCIMO = 3.0;
	
	private int quantidadeDependentes = 0;
	private double valorSalarioFamilia;
	private double percentualAcrescimoTotal;
	
	public int getQuantidadeDependentes() {
		return quantidadeDependentes;
	}

	public void setQuantidadeDependentes(int quantidadeDependentes) {
		this.quantidadeDependentes = quantidadeDependentes;
	}

	public double getValorSalarioFamilia() {
		return valorSalarioFamilia;
	}

	public void setValorSalarioFamilia(double valorSalarioFamilia) {
		this.valorSalarioFamilia = valorSalarioFamilia;
	}

	public double getPercentualAcrescimoTotal() {
		return percentualAcrescimoTotal;
	}

	public void setPercentualAcrescimoTotal(double percentualAcrescimoTotal) {
		this.percentualAcrescimoTotal = percentualAcrescimoTotal;
	}
	
	protected void calcularPercentualAcrescimo() {
		double acrescimoTotal = getQuantidadeDependentes() * PERCENTUAL_ACRESCIMO;
		setPercentualAcrescimoTotal(acrescimoTotal);
	}
	
	protected void calcularSalarioFamilia() {
		double salarioFamilia = (getQuantidadeDependentes() * VALOR_POR_DEPENDENTE *(1 + getPercentualAcrescimoTotal() / 100));
		setValorSalarioFamilia(salarioFamilia);
	}
}
