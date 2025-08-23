import java.util.Scanner;


public class Atividade1 {

	public static void main(String[] args) {
		final int TAM = 5;
		Scanner input = new Scanner(System.in);
		int[] num = new int[TAM];
		
		for(int i =0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º");
			num[i] = input.nextInt();
		}
		for(int i =0; i < TAM; i++) {
			System.out.println("Número "+(num[i]));
		}
		input.close();
		
		
		
	}

}
