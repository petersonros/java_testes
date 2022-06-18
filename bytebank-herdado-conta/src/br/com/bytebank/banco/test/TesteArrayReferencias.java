package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];	
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		// cria inst�ncia de ContaPoupanca
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		contas[1] = cc2;
		
		// System.out.println(cc2.getNumero());
		
		System.out.println(contas[1].getNumero());
		
		// alterou o tipo, realizando o cast
		ContaCorrente ref = (ContaCorrente) contas[0];
		
		// ambas aponta para o mesmo objeto
		System.out.println(cc2.getNumero()); 
		System.out.println(ref.getNumero());
	}

}
