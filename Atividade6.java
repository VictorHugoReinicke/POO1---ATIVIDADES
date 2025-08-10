import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o raio de um círculo");
		float raio = input.nextFloat();
		
		input.close();
		
		System.out.println("O valor da área é " + (Math.pow(raio,2) * 3.14));
		

	}

}
