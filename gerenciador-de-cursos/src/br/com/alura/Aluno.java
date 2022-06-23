package br.com.alura;

public class Aluno {

	// atributos da classe Aluno
	private String nome;
	private int numeroMatricula;

	// construtor
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser Null");
		}
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

	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	} // reescrevendo o método equals
	
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	} // reescrevendo o hashCode

	// metodo
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula:" + this.numeroMatricula + "]";
	}
}
