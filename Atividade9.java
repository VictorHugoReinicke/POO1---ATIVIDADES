import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tabuada de :");
		int tabu = input.nextInt();
		input.close();
		for(int i =1; i <=10; i++) {
			
			System.out.println(tabu +" X "+i+ " = " + (tabu*i));
			
			
		}
		

	}

}
