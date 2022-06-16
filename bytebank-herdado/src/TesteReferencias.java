
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente  g1 = new Gerente();
		g1.setNome(nome: "Marcos");
		g1.setSalario(salario: 5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(salario: 2500.0);
		
		Designer d = new Designer();
		d.setSalario(salario: 2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}
