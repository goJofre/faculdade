package br.com.gojofre;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = null;

		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		Enfermeira enfermeira = new Enfermeira();
		List<Cidadao> cidadaos = new ArrayList<Cidadao>();

		try {
			scanner = new Scanner(System.in);

			System.out.println("CPF da enfermeira");
			enfermeira.setCpf(scanner.next());

			System.out.println("Nome da enfermeira");
			enfermeira.setNome(scanner.next());
			String resposta = "";
			do {
				System.out.println("[1] - Vacinar Cidadão");
				System.out.println("[2] - Listar Cidadãos Vacinados");
				System.out.println("[3] - Sair");
				resposta = scanner.next();
				System.out.println("-----------------");
				if (resposta.equals("1") || resposta.toLowerCase().contains("vacinar")) {
					Cidadao cidadao = new Cidadao();
					System.out.println("CPF: ");
					cidadao.setCpf(scanner.next());

					System.out.println("Nome: ");
					cidadao.setNome(scanner.next());

					for (int i = 1; i <= 4; i++) {
						System.out.println("Data dose " + i + "º vacina: ");

						Date data = formataData.parse(scanner.next());
						if (cidadao.validaData(i, data)) {
							cidadao.setDataDoseVacina(i, data);
						} else {
							System.out.println("O cidadão ainda não tem direito a uma nova data");
							break;
						}

					}

					cidadaos.add(cidadao);

				} else if (resposta.equals("2") || resposta.toLowerCase().contains("listar")) {
					listar(cidadaos);
				}

			} while (!resposta.equals("3"));

		} catch (Exception e) {
		} finally {
			if (scanner != null)
				scanner.close();
		}

	}

	private static void listar(List<Cidadao> cidadaos) {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		for (Cidadao cidadao : cidadaos) {
			HashMap<Integer, Date> datasVacinas = cidadao.getDatasDoseVacina();
			System.out.println("Nome: " + cidadao.getNome() + " CPF: " + cidadao.getCpf());
			for (Integer i : datasVacinas.keySet()) {
				System.out.println("Dose: " + i + "º Data " + formataData.format(datasVacinas.get(i)));
			}
			System.out.println("-------------------");
		}
	}

}
