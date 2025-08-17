import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int contP=0;
		int contI=0;
		
		for(int i =0;i < 10;i++) {
			
			System.out.println("Número "+i);
			int num = input.nextInt();
				if((num %2)==0)
				contP++;
				else
				contI++;
		}
		input.close();
		System.out.println("Pares "+contP);
		System.out.println("Ímpares "+contI);

	}

}
