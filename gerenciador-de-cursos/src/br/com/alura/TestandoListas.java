package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas.";
		String aula2 = "Modelando a classe Aula.";
		String aula3 = "Trabalhando com Curso e Sets.";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		// [Conhecendo mais de listas., Modelando a classe Aula., Trabalhando com Curso e Sets.]
		
		aulas.remove(0);
		System.out.println(aulas);
		// [Modelando a classe Aula., Trabalhando com Curso e Sets.]
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		// A primeira aul é Modelando a classe Aula.
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula : " + aulas.get(i));
		}
		// aula : Modelando a classe Aula.
		// aula : Trabalhando com Curso e Sets.
		
		System.out.println(aulas.size());
		// 2
		
 // duas formas diferentes de laços for...
		aulas.forEach(aula -> {
			System.out.println("percorrendo: ");
			System.out.println("Aula " + aula);
		});
		// percorrendo: 
		// Aula Modelando a classe Aula.
		// percorrendo: 
		// Aula Trabalhando com Curso e Sets.
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		// Aula: Modelando a classe Aula.
		// Aula: Trabalhando com Curso e Sets.
		
		aulas.add("Aumentando o nosso conhecimento");
		System.out.println(aulas);
		// [Modelando a classe Aula., Trabalhando com Curso e Sets., aumentando o nosso conhecimento]
		
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: ");
		System.out.println(aulas);
		
	}
}
