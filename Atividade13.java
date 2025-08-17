import java.util.Scanner;
public class Atividade13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Num");
		int num = input.nextInt();
		input.close();
		int cont = 1;
		
		for(int i =1;i <=num;i++) {
			
			cont *= i;
			System.out.println(cont);
			
		}

	}

}
