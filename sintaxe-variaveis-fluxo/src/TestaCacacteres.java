
public class TestaCacacteres {
	
	public static void main(String[] args ) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65; // compile 
		System.out.println(valor);
		
		// valor = valor +1; // no compile
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia ";
		palavra = palavra + 2022;
		System.out.println(palavra);
	}
}
