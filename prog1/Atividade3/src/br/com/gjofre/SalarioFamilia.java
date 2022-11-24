package br.com.gjofre;

public class SalarioFamilia {
	
	private static double VALOR_POR_DEPENDENTE = 134.98;
	
	private int quantidadeDependentes;
	
	public int getQuantidadeDependentes() {
		return quantidadeDependentes;
	}

	public void setQuantidadeDependentes(int quantidadeDependentes) {
		this.quantidadeDependentes = quantidadeDependentes;
	}
	
	protected double calcularSalarioFamilia() {
		 return (getQuantidadeDependentes() * VALOR_POR_DEPENDENTE);
	}

}
