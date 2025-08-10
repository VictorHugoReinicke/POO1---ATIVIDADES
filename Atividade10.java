import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Num1");
		float num1 = input.nextFloat();
		System.out.println("Num2");
		float num2 = input.nextFloat();
		input.nextLine();
		System.out.println("Num3");
		float num3 = input.nextFloat();
		
		float maior = Math.max(num1,Math.max(num2, num3));
		float menor = Math.min(num1, Math.min(num2, num3));
		float meio = num1 + num2 + num3 - maior - menor;
		
		input.close();
		System.out.println("O maior número é: " + maior);
		System.out.println("O número do meio é: " + meio);
		System.out.println("O menor número é: " + menor);
		
	}

}
