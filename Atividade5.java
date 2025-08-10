import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Letra");
		String letra = input.nextLine();
		String vogal= "não é";
		
		if(letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || letra.toUpperCase().equals("I") || letra.toUpperCase().equals("O") || letra.toUpperCase().equals("U")) 
			vogal = "é";
		input.close();
		System.out.println("A letra "+ vogal + " vogal");
	}

}
