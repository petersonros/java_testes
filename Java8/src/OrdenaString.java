import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTAmanho();
		// Collections.sort(palavras, comparador); // até o Java7 era assim
		palavras.sort(comparador); // a partir do Java8 ficou assim
		System.out.println(palavras);

//		for(String p: palavras) {
//			System.out.println(p);
//		} // formato antigo

		Consumer<String> consumidor = null;
		palavras.forEach(consumidor);
	}

}

class ImprimeNaLinha implements Consumer<String> {
	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorPorTAmanho implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}
