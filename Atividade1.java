import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Num1");
		float num1 = input.nextFloat();
		System.out.println("Num2");
		float num2 = input.nextFloat();
		float maior = 0;
		if(num1 > num2)
			maior = num1;
		else
			maior = num2;
		input.close();
		System.out.println("O número "+ maior +" é o maior");
	}

}
