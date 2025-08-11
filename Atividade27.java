import java.util.Scanner;
public class Atividade27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Número");
		float num = input.nextFloat();
		
		String resultado = "";
		input.close();
		
		if((num % 1) ==0)
			resultado = "Inteiro";
		else
			resultado = "Decimal";

		System.out.println(resultado);
	}

}
