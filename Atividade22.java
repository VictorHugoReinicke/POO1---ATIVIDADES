import java.util.Scanner;
public class Atividade22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Número de eleitores");
		int vot = input.nextInt();
		
		int cA =0;
		int cB =0;
		int cC =0;
		
		for(int i =0; i <vot;i++) {
			System.out.println("Vota em quem(1,2,3)");
			int em = input.nextInt();
			
			
			if(em == 1)
				cA++;
			else if(em == 2)
				cB++;
			else if(em == 3)
				cC++;
			else
				System.out.println("Deu pro caralho");
			
		}
		input.close();
		System.out.println("Eleitor A " + cA);
		System.out.println("Eleitor B " + cB);
		System.out.println("Eleitor C " + cC);

	}

}
