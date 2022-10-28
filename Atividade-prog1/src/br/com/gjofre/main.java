package br.com.gjofre;

import java.util.Scanner;

/**
 * @author gabriel jofre
 * */
public class main {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario(1000, 7);
		System.out.println("Funcionário 1");
		funcionario1.calcularValorDesconto();
		funcionario1.calcularValorLiquido();
		System.out.println(funcionario1.toString());
		
		System.out.println("Funcionário 2");
		Funcionario funcionario2 = new Funcionario(5000, 13);	
		funcionario2.calcularValorDesconto();
		funcionario2.calcularValorLiquido();
		System.out.println(funcionario2.toString());
		
		Funcionario funcionario3 = new Funcionario(3000, 11);	
		System.out.println("Funcionário 3");
		funcionario3.calcularValorDesconto();
		funcionario3.calcularValorLiquido();
		System.out.println(funcionario3.toString());
		
		Funcionario funcionario4 = new Funcionario(7600, 12);	
		System.out.println("Funcionário 4");
		funcionario4.calcularValorDesconto();
		funcionario4.calcularValorLiquido();
		System.out.println(funcionario4.toString());
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			Funcionario funcionario5  = new Funcionario();
			System.out.print("Digite o sálario bruto: ");
			funcionario5.setSalarioBruto(scanner.nextDouble());
			System.out.print("Digite o percentual de desconto: ");
			funcionario5.setPercentualDesconto(scanner.nextDouble());
			funcionario5.calcularValorDesconto();
			funcionario5.calcularValorLiquido();
			System.out.println(funcionario5.toString());
		} finally {
			if(scanner != null)
				scanner.close();
		}
	}
}
