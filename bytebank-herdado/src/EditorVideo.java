
public class EditorVideo extends Funcionario {

		public double getBonificacao() {
			System.out.println("Bonificacao do Editor de Video.");
			return super.getBonificacao() + 100;
		}
}
