
public class TestesSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(senha: 2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(senha: 3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(senha: 2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}
}
