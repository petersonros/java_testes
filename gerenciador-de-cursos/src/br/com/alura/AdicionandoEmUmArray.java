package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class AdicionandoEmUmArray {

	public static void main(String[] args) {
		
		// Adicionando elementos em um ArrayList
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificado Java SE 8 Programer I";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println(cursos);
		
		// Removendo elementos de uma lista
		cursos.remove(1);
		System.out.println(cursos);
		
		// Acessando elementos da lista
		String primeiroCurso = cursos.get(0);
		System.out.println("Primeiro curso da lista: " + primeiroCurso);
		 // System.out.println("Primeiro curso da lista: "+ cursos.get(0));
		
		// Ordenar lista por ordem alfabetica
		Collections.sort(cursos);
		System.out.println("Cursos em ordem alfabetica: " + cursos);
	}
}
