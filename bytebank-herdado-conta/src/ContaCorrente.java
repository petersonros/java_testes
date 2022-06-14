

// new conta Contacorrente()
public class ContaCorrente extends Conta .implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Overrride
	public boolean saca(double valor) {
		double valorSacar = valor + 0.2;
		return super .saca(valorASacar);
	}
	
	@Overrride
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
