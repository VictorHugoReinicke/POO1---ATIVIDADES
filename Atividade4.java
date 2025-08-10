import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("nota 1 ");
		float num1 = input.nextFloat();
		
		System.out.println("nota 2 ");
		float num2 = input.nextFloat();
		
		System.out.println("nota 3 ");
		float num3 = input.nextFloat();
		
		System.out.println("nota 4 ");
		float num4 = input.nextFloat();
		
		input.close();
		
		System.out.println("A média foi de " + ((num1 + num2 + num3 + num4)/4));
	
	}

}
