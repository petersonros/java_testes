
// gerente é um Funcionario, gerente herda da class Funcionario

public class Designer extends Funcionario{

	public double getBonificacao() {
		System.out.println("chama o metodo bonificacao do Designer");
		return 200;
	}
}
