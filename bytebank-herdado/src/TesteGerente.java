
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente();
		
		Gerente g1 = new Gerente();
		g1.setNome(nome: "Marco");
		g1.setCpf(cpf: "23556813");
		g1.setSalario(salario; 5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(senha: 2222);
		boolean autenticou = g1.autentica(senha: 2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
