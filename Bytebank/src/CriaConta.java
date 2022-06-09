
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta é " + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta é " + segundaConta.saldo);
		
		segundaConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a segunda conta está na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta.");
		} else {
			System.out.println("contas diferentes.");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
