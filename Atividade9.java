import java.util.Scanner;
public class Atividade9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de graus em farenheit");
		float faren = input.nextFloat();
		
		input.close();
		
		System.out.println("O valor em célcius é " + ((faren - 32) * 5/9));

	}

}
