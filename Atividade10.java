import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite um número inteiro");
			int num1 = input.nextInt();
			
			System.out.println("Digite outro número inteiro");
			int num2 = input.nextInt();
			
			System.out.println("Digite um número float");
			float num3 = input.nextFloat();
			
			input.close();
			System.out.println("Dobro do primeiro com metade do segundo: " + ((num1 * 2) + (num2/2) ));
			System.out.println("Soma do triplo do primeiro com terceiro: "+ ((num1*3) + num3));
			System.out.println("Terceiro elevado ao cubo: " + Math.pow(num3,2));
	}

}
