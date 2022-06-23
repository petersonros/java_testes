package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopez");
		alunos.add("Rena Saggio");
		alunos.add("Mauricio Aniche");

		System.out.println(alunos.size());

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopez");

		System.out.println(pauloEstaMatriculado);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);

		// transformar um conjunto em uma lista
		// List<String> alunosEmLista = new ArrayList<>(alunos);

	}
}
