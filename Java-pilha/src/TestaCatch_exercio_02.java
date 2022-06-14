
public class TestaCatch_exercio_02 {

	public static void main(String[] args) {

		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException | NullPointerException ex) {
			ex.printStackTrace();
		}
	}
}
