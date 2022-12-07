package br.com.gojofre;

import java.util.HashMap;

public class Materia {
	private String nome;
	private HashMap<String, Double> notas = new HashMap<String, Double>();
	private int presencas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HashMap<String, Double> getNotas() {
		return notas;
	}

	public void setNota(String nomeNota, double nota) {
		notas.put(nomeNota, nota);
	}

	public int getPresencas() {
		return presencas;
	}

	public void setPresencas(int presencas) {
		this.presencas = presencas;
	}

	public double calcularPresenca() {
		return ((double) getPresencas() / 60) * 100;
	}

	public double calcularMedia() {
		double notas = 0.0;
		for (double nota : getNotas().values()) {
			notas += nota;
		}
		return notas / 3;
	}
}
