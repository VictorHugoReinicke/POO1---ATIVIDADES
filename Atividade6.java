import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Num inteiro");
		int num= input.nextInt();

		if((num % 2) == 0)
			System.out.println("Número par virou o número "+ (num + 1) + " para ser ímpar");	
		else
			System.out.println("Número ímpar virou o número "+ (num + 1) + " para ser par");
		
		input.close();
	}

}
