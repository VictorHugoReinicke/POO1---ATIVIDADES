import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		boolean parada = false;
		
		for(int i = 0; parada != true; i++ ) {
			
			System.out.println("Digite um número entre 0 e 10 para finalizar");
			int num = input.nextInt();
			if(num >= 0 && num <= 10)
				parada = true;
			System.out.println("O número foi " + num);
			
		}
		
		input.close();
		

	}

}
