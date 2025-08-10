import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de centímetros a ser convertido");
		
		float cent = input.nextFloat();
		
		input.close();
		
		System.out.println("O valor convertido é de " + (cent/100) + " m" );
		
	}

}
