
// contrato Autenticavel
	// quem assina esse contrato, precisa implmentar
		// metodo setSenha
		// metodo autentica

public class Autenticavel {
	
	public abstract void setSenha(int senha) ;
	
	public abstract boolean autentica(int senha) ;

}
