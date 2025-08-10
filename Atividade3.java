import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número ");
		float num1 = input.nextFloat();
		System.out.println("Digite o segundo número ");
		float num2 = input.nextFloat();
		
		input.close();
		
		System.out.println("Valor da soma " + (num1 + num2));

	}

}
