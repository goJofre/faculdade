package br.com.gjofre;

public class Main {

	public static void main(String[] args) {
		Salario salario1 = new Salario(1500,3);
		System.out.println(salario1.toString());
		
		Salario salario2 = new Salario(1234,2);
		System.out.println(salario2.toString());
		
		Salario salario3 = new Salario(4523,1);
		System.out.println(salario3.toString());
		
		Salario salario4 = new Salario(1700,0);
		System.out.println(salario4.toString());
	}

}
