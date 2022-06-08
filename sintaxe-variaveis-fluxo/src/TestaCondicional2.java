
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 17;
		//boolean acompanhado = true;
		//para as linhas 9 e 10 funcionar a 7 fica comentanda e vice versa.
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 1;
		
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
				System.out.println("Infeslizmente você não pode entrar.");
			}
		}
	}