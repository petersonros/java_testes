
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		nico.setNome(nome: "Nico Steppat");
		nico.setCpf(cpf: "223335646-9");
		nico.setSalario(salario: 2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		// nico.slario = 300.0;
		
	}
}
