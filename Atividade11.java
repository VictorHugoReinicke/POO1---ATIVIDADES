import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o período?");
		String periodo = input.nextLine();
		String cumprimento="";
		
		switch (periodo.toUpperCase()) {
			case "M":
				cumprimento = "Bom dia!";
				break;
			case "V":
				cumprimento = "Boa tarde!";
				break;
			case "N":
				cumprimento = "Boa noite!";
				break;		
		}
		
		input.close();
		System.out.println(cumprimento);
		
		
	}

}
