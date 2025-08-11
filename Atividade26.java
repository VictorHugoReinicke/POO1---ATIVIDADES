import java.util.Scanner;
public class Atividade26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número inteiro");
		int num = input.nextInt();
		
		input.close();
		String paridade = "";
		
		if((num%2) ==0 )
			paridade = "Par";
		else
			paridade = "Ímpar";
		
		System.out.println(paridade);

	}

}
