import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Atividade21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		
		System.out.println("Data dd/mm/aaaa");
		String ano = input.nextLine();
		input.close();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
        try {
            LocalDate data = LocalDate.parse(ano, formatter);
            System.out.println("Data válida: " + data);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida!");
        }
		
	}

}
