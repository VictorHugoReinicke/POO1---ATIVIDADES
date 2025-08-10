import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Letra");
		String letra = input.nextLine();
		String sexo= "";
		
		if(letra.toUpperCase().equals("F"))
			sexo = "Feminino";
		else if(letra.toUpperCase().equals("M"))
			sexo = "Masculino";
		
		input.close();
		System.out.println("O sexo é "+ sexo);
	}

}
