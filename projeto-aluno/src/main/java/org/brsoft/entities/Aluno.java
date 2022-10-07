package org.brsoft.entities;

public class Aluno {
	public static final int FREQUENCIA_MINIMA = 75;
	public static final double NOTA_MINIMA = 6.0;
	public static final int LIMITE_INFERIOR_NOME = 2;
	public static final int LIMITE_SUPERIOR_NOME = 100;
	private String nome;
	private double nota;
	private int frequencia;

	public Aluno(String nome, double nota, int frequencia) {
		if (nome.length() < LIMITE_INFERIOR_NOME || nome.length() > LIMITE_SUPERIOR_NOME) {
			throw new IllegalArgumentException("O nome não pode ter menos de 2 caracteres e maior que 100 caracteres.");
		}
		this.nome = nome;
		this.nota = nota;
		this.frequencia = frequencia;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public boolean estaAprovado() {
		return (nota < NOTA_MINIMA || frequencia < FREQUENCIA_MINIMA ? false : true);
	}

}
