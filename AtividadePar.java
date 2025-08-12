package aula1208;
import java.util.Scanner;

public class AtividadePar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num =0;
		boolean par = true;
		
		do {
		
		System.out.println("Digite um par para finalizar");
		
		num = input.nextInt();
		par = true;
		
		if((num %2)!=0) {
			par = false;
			System.out.println("Número digitado errado");
		}
		else
			System.out.println("Boa garotinho!");
		
		}
		while(par == false);
		
		input.close();
		
		
		
		
	}

}
