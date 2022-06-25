package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class OrdenaPorIdade implements Comparator<Funcionario> {
	// método comprare
}

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Barney", 12);
		Funcionario f2 = new Funcionario("Jonatan", 9);
		Funcionario f3 = new Funcionario("Guaraciara", 13);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while (Iterator.hasNext()) {
			System.out.println(iterator.next().getNome());
		}
	}
}
