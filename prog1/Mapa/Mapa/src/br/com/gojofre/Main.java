package br.com.gojofre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Materia materia = new Materia();
		materia.setNome("prog1");
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			String continuar = "n";
			do {
				Aluno aluno = new Aluno();

				System.out.print("Matrícula do aluno: ");
				aluno.setMatricula(scanner.next());

				System.out.print("Nome do aluno: ");
				aluno.setNome(scanner.next());

				for (int i = 1; i <= 3; i++) {
					String nomeNota = "n" + i;
					System.out.print(nomeNota + ": ");
					materia.setNota(nomeNota, scanner.nextDouble());
				}

				System.out.print("Quantidade de presenças: ");
				materia.setPresencas(scanner.nextInt());
				aluno.setMateria(materia);

				System.out.print("Deseja incluir outro aluno? S / N ");
				continuar = scanner.next();

				alunos.add(aluno);
			} while (continuar.toLowerCase().equals("s"));

			for (Aluno aluno : alunos) {
				System.out.println("---------");
				System.out.println("Matrícula: " + aluno.getMatricula());
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Média: " + aluno.getMateria().calcularMedia());
				System.out.println("Média: " + aluno.getMateria().calcularPresenca() + "%");
			}

		} finally {
			if (scanner != null)
				scanner.close();
		}

	}

}
