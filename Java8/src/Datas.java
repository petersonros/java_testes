
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(agora);

		Period periodo = Period.between(agora, dataFutura);
		System.out.println(periodo);

		LocalDate data = LocalDate.of(2099, 1, 25);
		System.out.println(data);

		LocalDate data1 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(data1);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(agora);
		System.out.println(dataFormatada);
	}
}
