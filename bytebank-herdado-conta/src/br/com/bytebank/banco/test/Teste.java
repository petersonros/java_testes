package br.com.bytebank.banco.test;

public class Teste {

	// Array[]
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // inicia no indice 0
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade1 = idades[4];
		
		System.out.println(idade1);
		
		System.out.println(idades.length);
	}

}
