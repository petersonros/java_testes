package br.com.bytebank.banco.test;

public class TestaArrayLacoFor {

	public static void main(String[] args) {
		//  testando array com la�o for
		
		int[] idades = new int[5];
		
		for(int i = 0; i < idades.length; i++ ) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}

}
