import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado");
		float lado = input.nextFloat();
		
		input.close();
		
		System.out.println("O valor da área de um quadrado com os lados equivalentes ao valor apresentado é de " + (Math.pow(lado, 2)));

	}

}
