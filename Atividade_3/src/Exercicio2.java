import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio2 {

	
	
	public static void main(String[]args) {

		LocalDateTime dt = LocalDateTime.of(2012, 9, 10, 12, 00);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm");

		System.out.println(dt.format(dtf));

		System.out.println(dt.format(dtf.ofPattern("dd-MM-yy h:mm:ss")));

		System.out.println(dt.getDayOfWeek());

		System.out.println(dt.getYear());

		System.out.println(dt.format(dtf.ofPattern("G")));
	
	}
	
	
	
	
}
