package br.com.alura;

public class Recibo {

	// atributos da classe e métodos acessadores/alteradores
	// atributos da classe Aluno
	private String recibo;
	private int numeroRecibo;

	// construtor
	public void Aluno(String recibo, int numeroRecibo) {
		if (recibo == null) {
			throw new NullPointerException("Recibo não pode ser Null");
		}
		this.recibo = recibo;
		this.numeroRecibo = numeroRecibo;
	}
	
	Recibo rec1 = new Recibo();
	// atribui valores
	Recibo rec2 = new Recibo();
	// atribui valores
	Recibo rec3 = new Recibo();
	// atribui valores
	
	public String  getRecibo() {
		return recibo;
	}
	
//	public String  getNumeroRecibo() {
//		return numeroRecibo;
//	}
	
}
