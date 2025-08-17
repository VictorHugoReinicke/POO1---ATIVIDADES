import java.util.Scanner;
public class Atividade26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Preço do pão");
		float pao = input.nextFloat();
		input.close();
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int i =1; i<= 50;i++) {
			
			System.out.println(i + " - R$ "+ (i*pao));
			
		}
		
	}

}
