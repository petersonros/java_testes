package br.com.alura;

public class Aluno {

	// atributos da classe Aluno
	private String nome;
	private int numeroMatricula;

	// construtor
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	// getter
	public String getNome() {
		return nome;
	}

	// getter
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	// metodo
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula:" + this.numeroMatricula + "]";
	}

}
