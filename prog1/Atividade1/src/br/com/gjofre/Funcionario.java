package br.com.gjofre;

/**
 * @author gabriel jofre
 * */
public class Funcionario {

	private double salarioBruto;
	private double percentualDesconto;
	private double valorDesconto;
	private double valorLiquido;
	
	public Funcionario() {
	}

	public Funcionario(double salarioBruto, double percentualDesconto) {
		this.salarioBruto = salarioBruto;
		this.percentualDesconto = percentualDesconto;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double getPercentualDesconto() {
		return percentualDesconto;
	}
	
	public void setPercentualDesconto(double percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	
	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	
	public void calcularValorDesconto() {
		setValorDesconto(getSalarioBruto() * (getPercentualDesconto()/100));
	}
	
	public void calcularValorLiquido() {
		setValorLiquido(getSalarioBruto() - getValorDesconto());
	}
	 
	@Override
	public String toString() {
		return "Salário bruto R$ " + this.salarioBruto + "\n" +
			   "Valor do desconto R$ " + this.valorDesconto + "\n" +
			   "Salário líquido R$ " + this.valorLiquido + "\n" + 
			   "-------------";
	}
	
}
