import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int TAM = 4;
		float[] nts = new float[TAM];
		float media = 0;
		for(int i = 0; i < TAM; i ++) {
			
			System.out.println("Digite a nota");
			nts[i] = input.nextFloat();
			media += nts[i];
			
			
		}
		for(int i = 0; i < TAM; i ++) {
			System.out.println(nts[i]);	
			
		}
		input.close();
		System.out.println("Média "+ (media/TAM));
		
				

	}

}
