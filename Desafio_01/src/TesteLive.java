import javax.swing.JOptionPane;

public class TesteLive {

	public static void main(String[] args) {

		// double numero = Double.parseDouble(JOptionPane.showInputDialog("Escreva um
		// numero para multiplicar por 2"));

		Object color = JOptionPane.showInputDialog(null, "Escolha uma cor", "Cores", JOptionPane.WARNING_MESSAGE, null,
				new Object[] { "Escolha", "Amarelo", "Azul", "Vermelho", }, "Escolha");
	}
}


//information
//warning
//question