import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Base");
		int base = input.nextInt();
		
		System.out.println("Expoente");
		int expoente = input.nextInt();
		
		input.close();
		
		
		for(int i = 0;i <= expoente;i++ ) {
			int cont = 1;
			for(int j =0;j<i;j++) {
				cont *=base;
			}			
			System.out.println(cont);
		}
		

	}

}
