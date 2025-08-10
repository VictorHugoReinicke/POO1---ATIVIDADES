import java.time.Year;
import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ano");
		int ano = input.nextInt();
		String bissexto = "não é bissexto";
		
		if(Year.of(ano).isLeap()) 
			bissexto = "é bissexto";
		
		
		input.close();
		System.out.println("O ano "+ bissexto);
	}

}
