// n�o pode instanciar classe abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// metodo sem corpo, n�o h� implementa��o
	//	 um m�todo abstrato define apenas a assinatura 
	//	 (visibilidade, retorno, nome do m�todo e par�metros).
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		this.nome = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	okokok ok ok ok ok ok
}
