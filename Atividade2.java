import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		String nome = "";
		String pass = "";
		boolean parada = true;
		
		Scanner input = new Scanner(System.in);
		
		for(int i =0; parada == true; i++) {
			
			System.out.println("Digite seu nome");
			nome = input.nextLine();
			
			System.out.println("Digite sua senha");
			pass = input.nextLine();
			
			if(!nome.equals(pass)) {
				parada = false;
				System.out.println("Deu boa");
			}
			else
				System.out.println("Deu ruim");
		}
		
		input.close();
		
		
	}
	

}
